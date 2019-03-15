package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    //Allows the user to make a class off a form
    public FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    public HomeController() {

    }

    public Result index() {
        return ok(index.render(Employees.getEmployeeById(session().get("id"))));
    }

    public Result databaseTest() {
        List<Project> plist = Project.findAll();
        List<Address> alist = Address.findAll();
        return ok(databaseTest.render(plist, alist, Employees.getEmployeeById(session().get("id"))));
    }

    public Result employees() {
        List<Manager> mList = null;
        List<Worker> wList = null;

        mList = Manager.findAll();
        wList = Worker.findAll();
        return ok(employees.render(mList, wList, Employees.getEmployeeById(session().get("id"))));
    }

    public Result addManager() {
        Form<Manager> employeeForm = formFactory.form(Manager.class);
        return ok(addManager.render(employeeForm, Manager.getEmployeeById(session().get("id"))));
    }

    @Transactional
    public Result addManagerSubmit() {
        Form<Manager> newEmployeeForm = formFactory.form(Manager.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {
            System.out.println("Id: "+newEmployeeForm.field("id").getValue().get());
            System.out.println("Role: "+newEmployeeForm.field("role").getValue().get());
            System.out.println("First Name: "+newEmployeeForm.field("fName").getValue().get());
            System.out.println("Last Name: "+newEmployeeForm.field("lName").getValue().get());
            System.out.println("Salary: "+newEmployeeForm.field("salary").getValue().get());
            System.out.println("Password: "+newEmployeeForm.field("password").getValue().get());
            return badRequest(addManager.render(newEmployeeForm, Employees.getEmployeeById(session().get("id"))));
        
        } else {
            Employees newEmployees = newEmployeeForm.get();

            if (Employees.getEmployeeById(newEmployees.getId()) == null) {
                System.out.println("Save");
                newEmployees.save();
            } else {
                System.out.println("Update");
                newEmployees.update();
            }

            flash("success", "Employee " + newEmployees.getfName() + " has been added/updated.");

            return redirect(controllers.routes.HomeController.employees());
        }
    }

    public Result deleteManager(String id) {
        Manager emp = (Manager) Employees.getEmployeeById(id);
        emp.delete();

        //Shows the result
        flash("success", "Employee has been removed successfully.");
        return redirect(controllers.routes.HomeController.employees());
    }


    public Result updateManager(String id) {
        Manager emp;
        Form<Manager> employeeForm;

        try {
            //i = Employees.find.byId(id);
            emp = (Manager) Employees.getEmployeeById(id);
            emp.update();

            employeeForm = formFactory.form(Manager.class).fill(emp);
        } catch (Exception e) {
            return badRequest("error");
        }

        return ok(addManager.render(employeeForm, Employees.getEmployeeById(session().get("id"))));
    }

    public Result addWorker() {
        Form<Worker> employeeForm = formFactory.form(Worker.class);
        return ok(addWorker.render(employeeForm, Employees.getEmployeeById(session().get("id"))));
    }

    @Transactional
    public Result addWorkerSubmit() {
        Form<Worker> newEmployeeForm = formFactory.form(Worker.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {

            return badRequest(addWorker.render(newEmployeeForm, Employees.getEmployeeById(session().get("id"))));
        
        } else {
            Employees newEmployees = newEmployeeForm.get();

            System.out.println("Id: "+newEmployeeForm.field("id").getValue().get());
            System.out.println("Role: "+newEmployeeForm.field("role").getValue().get());
            System.out.println("fName: "+newEmployeeForm.field("fName").getValue().get());
            System.out.println("lName: "+newEmployeeForm.field("lName").getValue().get());
            System.out.println("salary: "+newEmployeeForm.field("salary").getValue().get());
            System.out.println("password: "+newEmployeeForm.field("password").getValue().get());


            if (Employees.getEmployeeById(newEmployees.getId()) == null) {
                System.out.println("Save");
                newEmployees.save();
            } else {
                System.out.println("Update");
                newEmployees.update();
            }

            flash("success", "Employee " + newEmployees.getfName() + " has been added/updated.");

            return redirect(controllers.routes.HomeController.employees());
        }
    }

    public Result deleteWorker(String id) {
        Worker emp = (Worker) Employees.getEmployeeById(id);
        emp.delete();

        //Shows the result
        flash("success", "Employee has been removed successfully.");
        return redirect(controllers.routes.HomeController.employees());
    }


    public Result updateWorker(String id) {
        Worker emp;
        Form<Worker> employeeForm;

        try {
            //i = Employees.find.byId(id);
            emp = (Worker) Employees.getEmployeeById(id);
            emp.update();

            employeeForm = formFactory.form(Worker.class).fill(emp);
        } catch (Exception e) {
            return badRequest("error");
        }

        return ok(addWorker.render(employeeForm, Employees.getEmployeeById(session().get("id"))));
    }

    public Result addProject() {
        Form<Project> projectForm = formFactory.form(Project.class);
        return ok(addProject.render(projectForm, Employees.getEmployeeById(session().get("id"))));
    }

    @Transactional
    public Result addProjectSubmit() {
        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (newProjectForm.hasErrors()) {
            //gives new form if an error has been input
            return badRequest(addProject.render(newProjectForm, Employees.getEmployeeById(session().get("id"))));
        } else {
            Project newProject = newProjectForm.get();

            List<Employees> newEmps = new ArrayList<Employees>();
            for (String emp : newProject.getEmpSelect()) {
               //newEmps.add(Employees.getId());
            }
            //newProject.setEmps(newEmps);
            newProject.save();
            

            flash("success", "Project " + newProject.getName() + " has been added.");

            return redirect(controllers.routes.HomeController.databaseTest());
        }
    }

    public Result deleteProject(Long id) {
        Project.find.ref(id).delete();

        flash("success", "Project has been removed successfully.");
        return redirect(controllers.routes.HomeController.databaseTest());
    }

    // public Result updateProject(Long id) {
    //     Project i;
    //     Form<Project> projectForm;

    //     try {
    //         i = Project.find.byId(id);

    //         projectForm = formFactory.form(Project.class).fill(i);
    //     } catch (Exception e) {
    //         return badRequest("error");
    //     }

    //     return ok(addProject.render(projectForm, Employees.getEmployeeById(session().get("empId"))));
    // }

    // public Result add


}