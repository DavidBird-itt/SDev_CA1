package controllers;

import play.mvc.*;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public HomeController() {}

    public Result index() {
        return ok(index.render(Employees.getEmployeeById(session().get("empId"))));
    }

    public Result databaseTest() {
        List < Employees > empList = Employees.findAll();
        return ok(databaseTest.render(empList, Employees.getEmployeeById(session().get("empId"))));
    }


    public Result addEmployee() {
        Form < Employees > employeeForm = formFactory.form(Employees.class);
        return ok(addEmplyee.render(employeeForm, User.getUserById(session().get("id"))));
    }

    public Result addEmployeeSubmit() {
        Form < Employees > newEmployeeForm = formFactory.form(Employees.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmplyee.render(newEmployeeForm, User.getUserById(session().get("id"))));
        } else {
            Employees newEmployee = newEmployeeForm.get();

            if (newEmployee.getId() == null) {
                newEmployee.save();
            } else {
                newEmployee.update();
            }

            flash("success", "Employee " + newEmployee.getfName() + " has been added/updated.");

            return redirect(controllers.routes.HomeController.datebaseTest());
        }
    }

    public Result deleteEmployee(Long id) {
        Employees.find.ref(id).delete();

        flash("success", "Employee has been removed successfully.");
        return redirect(controllers.routes.HomeController.databaseTest());
    }

}