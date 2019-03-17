package controllers;

import play.mvc.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

import views.html.*;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    //Allows the user to make a class off a form
    private FormFactory formFactory;

    private Environment e;

    @Inject 
    public HomeController(FormFactory f, Environment env) {
        this.formFactory=f;
        this.e=env;
    }

    public HomeController() {}

    public Result index() { 
        if(Employees.getEmployeeById(session().get("email")) != null){
            return ok(index.render(Employees.getEmployeeById(session().get("email"))));
        } else {
            Form<Login> loginForm = formFactory.form(Login.class);
            return ok(login.render(loginForm, Employees.getEmployeeById(session().get("email"))));
        }
    }
    
    public Result databaseTest() {
        List < Project>plist=Project.findAll();
        List < Address>alist=Address.findAll();
        return ok(databaseTest.render(plist, alist, Employees.getEmployeeById(session().get("email"))));
    }

    public Result employees() {
        List < Manager>mList=null;
        List < Worker>wList=null;

        mList=Manager.findAll();
        wList=Worker.findAll();
        return ok(employees.render(mList, wList, Employees.getEmployeeById(session().get("email")), e));
    }


    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result addManager() {
        Form < Manager>employeeForm=formFactory.form(Manager.class);
        Form<Address> aForm = formFactory.form(Address.class);
        Form<Department> dForm = formFactory.form(Department.class);
        return ok(addManager.render(employeeForm, aForm, dForm, Manager.getEmployeeById(session().get("email")), e));
    }

    @Security.Authenticated(Secured.class)
    @Transactional 
    public Result addManagerSubmit() {
        Form < Manager>newEmployeeForm=formFactory.form(Manager.class).bindFromRequest();
        Form<Address> newAddressForm=formFactory.form(Address.class).bindFromRequest();
        Form<Department> newDepartmentForm=formFactory.form(Department.class).bindFromRequest();
        if (newEmployeeForm.hasErrors()) {
            System.out.println("Email: "+ newEmployeeForm.field("email").getValue().get());
            System.out.println("Role: "+ newEmployeeForm.field("role").getValue().get());
            System.out.println("First Name: "+ newEmployeeForm.field("fName").getValue().get());
            System.out.println("Last Name: "+ newEmployeeForm.field("lName").getValue().get());
            System.out.println("Salary: "+ newEmployeeForm.field("salary").getValue().get());
            System.out.println("Password: "+ newEmployeeForm.field("password").getValue().get());
            
            System.out.println("Street 1: "+ newAddressForm.field("street1").getValue().get());
            System.out.println("Street 2: "+ newAddressForm.field("street2").getValue().get());
            System.out.println("Town: "+ newAddressForm.field("town").getValue().get());
            System.out.println("County: "+ newAddressForm.field("County").getValue().get());
            System.out.println("Eircode: "+ newAddressForm.field("eircode").getValue().get());
            return badRequest(addManager.render(newEmployeeForm, newAddressForm, newDepartmentForm, Employees.getEmployeeById(session().get("email")), e));

        }

        else {
            Employees newEmployee=newEmployeeForm.get();
            Address address = newAddressForm.get();
            Department dep = newDepartmentForm.get();
            
            newEmployee.setAddress(address);
            newEmployee.setDepartment(dep);

            if (Employees.getEmployeeById(newEmployee.getEmail())==null) {
                System.out.println("Save");
                newEmployee.save();
            }

            else {
                System.out.println("Update");
                newEmployee.update();
            }

            flash("success", "Employee "+ newEmployee.getfName() + " has been added/updated.");

            return redirect(controllers.routes.HomeController.employees());
        }
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthManager.class)
    public Result deleteManager(String email) {
        Manager emp=(Manager) Employees.getEmployeeById(email);
        emp.delete();

        //Shows the result
        flash("success", "Employee has been removed successfully.");
        return redirect(controllers.routes.HomeController.employees());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthManager.class)
    public Result updateManager(String email) {
        Manager emp;
        Address a;
        Department d;

        Form <Manager> employeeForm;
        Form<Address> aForm;
        Form<Department> dForm;

        try {
            //i = Employees.find.byId(id);
            emp=(Manager) Employees.getEmployeeById(email);
            emp.update();

            a= emp.getAddress();
            d= emp.getDepartment();

            employeeForm=formFactory.form(Manager.class).fill(emp);
            aForm=formFactory.form(Address.class).fill(a);
            dForm=formFactory.form(Department.class).fill(d);
        }

        catch (Exception e) {
            return badRequest("error");
        }

        return ok(addManager.render(employeeForm,aForm,dForm,Employees.getEmployeeById(session().get("email")), e));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result addWorker() {
        Form < Manager> employeeForm=formFactory.form(Manager.class);
        Form<Address> aForm = formFactory.form(Address.class);
        Form<Department> dForm = formFactory.form(Department.class);
        return ok(addManager.render(employeeForm, aForm, dForm, Manager.getEmployeeById(session().get("email")), e));
    }
    
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addWorkerSubmit() {
        Form < Manager>newEmployeeForm=formFactory.form(Manager.class).bindFromRequest();
        Form<Address> newAddressForm=formFactory.form(Address.class).bindFromRequest();
        Form<Department> newDepartmentForm=formFactory.form(Department.class).bindFromRequest(); 
        if (newEmployeeForm.hasErrors()) {
            System.out.println("Email: "+ newEmployeeForm.field("email").getValue().get());
            System.out.println("Role: "+ newEmployeeForm.field("role").getValue().get());
            System.out.println("First Name: "+ newEmployeeForm.field("fName").getValue().get());
            System.out.println("Last Name: "+ newEmployeeForm.field("lName").getValue().get());
            System.out.println("Salary: "+ newEmployeeForm.field("salary").getValue().get());
            System.out.println("Password: "+ newEmployeeForm.field("password").getValue().get());

            System.out.println("Street 1: "+ newAddressForm.field("street1").getValue().get());
            System.out.println("Street 2: "+ newAddressForm.field("street2").getValue().get());
            System.out.println("Town: "+ newAddressForm.field("town").getValue().get());
            System.out.println("County: "+ newAddressForm.field("County").getValue().get());
            System.out.println("Eircode: "+ newAddressForm.field("eircode").getValue().get());
            return badRequest(addManager.render(newEmployeeForm, newAddressForm, newDepartmentForm, Employees.getEmployeeById(session().get("email")), e));
        }

        else {
            Worker newEmployees = newEmployeeForm.get(); 
            if (Employees.getEmployeeById(newEmployees.getEmail())==null) {
                System.out.println("Save");
                newEmployees.save();
            

            } else {
                System.out.println("Update");
                newEmployees.update();

                MultipartFormData < File> data=request().body().asMultipartFormData();
                FilePart < File> image = data.getFile("upload");
                String saveImageMessage = saveFile(newEmployees.getId(), image);
                flash("success ", "Worker "+ newEmployees.getEmail() + " was added/updated "+ saveImageMessage);
            }
            return redirect(controllers.routes.HomeController.employees());

        }
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthManager.class)
    public Result deleteWorker(String email) {
        Worker emp=(Worker) Employees.getEmployeeById(email);
        emp.delete();
        //Shows the result
        flash("success", "Employee has been removed successfully.");
        return redirect(controllers.routes.HomeController.employees());
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthManager.class)
    public Result updateWorker(String email) {
        Worker emp;
        Form < Worker>employeeForm;

        try {
            //i = Employees.find.byId(id);
            emp=(Worker) Employees.getEmployeeById(email);
            emp.update();

            employeeForm=formFactory.form(Worker.class).fill(emp);
        }

        catch (Exception e) {
            return badRequest("error");
        }

        return ok(addWorker.render(employeeForm, Employees.getEmployeeById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result addProject() {
        Form < Project>projectForm=formFactory.form(Project.class);
        return ok(addProject.render(projectForm, Employees.getEmployeeById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional 
    public Result addProjectSubmit() {
        Form < Project>newProjectForm=formFactory.form(Project.class).bindFromRequest();

        if (newProjectForm.hasErrors()) {
            //gives new form if an error has been input
            return badRequest(addProject.render(newProjectForm, Employees.getEmployeeById(session().get("email"))));
        }

        else {
            Project newProject=newProjectForm.get();

            List < Worker>newWorker=new ArrayList < Worker>();
            for (Long worker: newProject.getWorkerSelect()) {
                newWorker.add(Worker.find.byId(worker));
            }
            newProject.setWorkers(newWorker);

            if(newProject.getId() == null){
                newProject.save();
            } else {
                newProject.update();
            }

            flash("success", "Project "+ newProject.getName() + " has been added.");

            return redirect(controllers.routes.HomeController.databaseTest());
        }
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthManager.class)
    public Result deleteProject(Long id) {
        Project.find.ref(id).delete();

        flash("success", "Project has been removed successfully.");
        return redirect(controllers.routes.HomeController.databaseTest());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthManager.class)
    public Result updateProject(Long id) {
        Project i;
        Form < Project>projectForm;

        try {
            i=Project.find.byId(id);

            projectForm=formFactory.form(Project.class).fill(i);
        }catch (Exception e) {
            return badRequest("error");
        }

        return ok(addProject.render(projectForm, Employees.getEmployeeById(session().get("email"))));
    }

    public String saveFile(Long id, FilePart < File > uploaded) {
        if (uploaded !=null) {
            String mimeType=uploaded.getContentType();

            if (mimeType.startsWith("image/")) {
                String fileName=uploaded.getFilename();

                String extension="";
                int i=fileName.lastIndexOf('.');

                if (i >=0) {
                    extension=fileName.substring(i + 1);
                }

                File file=uploaded.getFile();

                File dir=new File("public/images/workerImages");

                if ( !dir.exists()) {
                    dir.mkdirs();
                }

                File newFile=new File("public/images/workerImages/", id + "."+ extension);

                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img=ImageIO.read(newFile);
                        BufferedImage scaledImg=Scalr.resize(img, 90);

                        if (ImageIO.write(scaledImg, extension, new File("public/images/workerImages/", id + "testImageThumb.jpg"))) {
                            return "/ file uploaded and thumbnail created.";
                        } else {
                            return "/ file uploaded but thumbnail creation failed.";
                        }

                    }

                    catch (IOException e) {
                        return "/ file uploaded but thumbnail creation failed.";
                    }

                }

                else {
                    return "/ file upload failed.";
                }
            }
        }
            return "/ no image file.";

        
    }
}