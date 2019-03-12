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

    public HomeController() {}

    public Result index() {
        return ok(index.render(Employees.getEmployeeById(session().get("empId"))));
    }

    public Result databaseTest() {
        List<Employees> elist = Employees.findAll();
        List<Project> plist = Project.findAll();
        List<Address> alist = Address.findAll();
        return ok(databaseTest.render(elist, plist, alist, Employees.getEmployeeById(session().get("Id"))));
    }

    public Result addEmployee() {
        Form<Employees> employeeForm = formFactory.form(Employees.class);
        return ok(addEmployee.render(employeeForm, Employees.getEmployeeById(session().get("Id"))));
    }

    @Transactional
    public Result addEmployeeSubmit() {
        Form<Employees> newEmployeeForm = formFactory.form(Employees.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmployee.render(newEmployeeForm, Employees.getEmployeesById(session().get("empId"))));
        
        } else {
            Employees newEmployees = newEmployeeForm.get();

            if (newEmployees.getId() == null) {
                newEmployees.save();
            } else {
                newEmployees.update();
            }

            flash("success", "Employee " + newEmployees.getfName() + " has been added/updated.");

            return redirect(controllers.routes.HomeController.databaseTest());
        }
    }

    public Result deleteEmployee(Long id) {
        Employees.find.ref(id).delete();

        flash("success", "Employee has been removed successfully.");
        return redirect(controllers.routes.HomeController.databaseTest());
    }



    public Result addProject() {
        Form<Projects> projectForm = formFactory.form(Project.class);
        return ok(addProject.render(projectForm, Project.getProjectById(session().get("id"))));
    }

    @Transactional
    public Result addProjectSubmit() {
        Form<Projects> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (newProjectForm.hasErrors()) {
            return badRequest(addProject.ender(newProjectForm, Project.getProjectById(session().get("id"))));
        } else {
            Project newProject = newProjectForm.get();

            if(newProject.getId() == null) {
                newProject.save();
            } else {
                newProject.update();
            }

            flash("success", "Project " + newProject.getName() + " has been added.");

            return redirect(controllers.routes.HomeController.datebaseTest());
        }
    }

    public Result deleteProject(Long id) {
        Project.find.ref(id).delete();

        flash("success", "Project has been removed successfully.");
        return redirect(controllers.routes.HomeController.databaseTest());
    }


}