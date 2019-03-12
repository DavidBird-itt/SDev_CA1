package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.users.*;

import views.html.*;

public class LoginController extends Controller {
    private FormFactory formFactory;

    @Inject
    public LoginController(FormFactory f) {
        this.formFactory = f;
    }

    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm, Employees.getEmployeeById(session().get("empId"))));
    }

    public Result loginSubmit() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm, Employees.getEmployeeById(session().get("empId"))));
        } else {
            //Clear sessions
            session().clear();

            //Store in cookie
            session("empId", loginForm.get().getEmpId());

            return redirect(controllers.routes.HomeController.index());
        }
    }

    public Result logout() {
        //Clears the login session
        session().clear();
        flash("success", "You have been logged out");

        return redirect(routes.LoginController.login());
    }

    public Result createAccount() {
        Form<User> userForm = formFactory.form(User.class);
        return ok(createAccount.render(userForm, User.getUserById(session().get("email"))));
    }

    public Result createAccountSubmit() {
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();

        //Check for errors
        if (newUserForm.hasErrors()) {
            return badRequest(createAccount.render(newUserForm, User.getUserById(session().get("email"))));

        } else {
            //extract the form and then save to the DB
            User newUser = newUserForm.get();
        //    newUser.save();
            //Show it worked
            flash("success", "User added.");

            return redirect(controllers.routes.LoginController.login());

        }
    }

}