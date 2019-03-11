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
        List<Employees> empList = Employees.findAll();
        return ok(databaseTest.render(empList, Employees.getEmployeeById(session().get("empId"))));
    }

/*
    public Result addEmployee() {
        Form<Employees> employeeForm = formFactory.form(Employees.class);
        return ok(addEmployee.render(employeeForm, Employees.getEmployeesById(session().get("empId"))));
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
*/
}