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
        List<Employees> elist = Employees.findAll();
        List<Project> plist = Project.findAll();
        List<Address> alist = Address.findAll();
        return ok(databaseTest.render(elist, plist, alist, Employees.getEmployeeById(session().get("id"))));
    }

    public Result addEmployee() {
        Form<Employees> employeeForm = formFactory.form(Employees.class);
        return ok(addEmployee.render(employeeForm, Employees.getEmployeeById(session().get("id"))));
    }

    @Transactional
    public Result addEmployeeSubmit() {
        Form<Employees> newEmployeeForm = formFactory.form(Employees.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {
            System.out.println("Id: "+newEmployeeForm.field("id").getValue().get());
            System.out.println("Type: "+newEmployeeForm.field("type").getValue().get());
            System.out.println("fName: "+newEmployeeForm.field("fName").getValue().get());
            System.out.println("lName: "+newEmployeeForm.field("lName").getValue().get());
            System.out.println("salary: "+newEmployeeForm.field("salary").getValue().get());
            return badRequest(addEmployee.render(newEmployeeForm, Employees.getEmployeeById(session().get("id"))));
        
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

            return redirect(controllers.routes.HomeController.databaseTest());
        }
    }

    public Result deleteEmployee(String id) {
        //Employees.find.ref(id).delete();
        Employees i;

        i = Employees.getEmployeeById(id);
        i.delete();
        //Shows the result
        flash("success", "Employee has been removed successfully.");
        return redirect(controllers.routes.HomeController.databaseTest());
    }


    public Result updateEmployee(String id) {
        Employees i;
        Form<Employees> employeeForm;

        try {
            //i = Employees.find.byId(id);
            i = Employees.getEmployeeById(id);

            employeeForm = formFactory.form(Employees.class).fill(i);
        } catch (Exception e) {
            return badRequest("error");
        }

        return ok(addEmployee.render(employeeForm, Employees.getEmployeeById(session().get("id"))));
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