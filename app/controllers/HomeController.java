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

    public HomeController() {
    }

    public Result index() {
        return ok(index.render(Employees.getEmployeeById(session().get("empId"))));
    }

    public Result databaseTest() {
        List<Employees> empList = Employees.findAll();
        return ok(databaseTest.render(empList, Employees.getEmployeeById(session().get("empId"))));
    }

}
