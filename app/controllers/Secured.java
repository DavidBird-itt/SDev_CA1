package controllers;

import play.mvc.*;
import play.mvc.Http.*;

public class Secured extends Security.Authenticator {
    //this checks if the user has already logged in

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    //If the user enters a location that they need to be logged into to reach
    //they are redirected to the login page

    public Result onUnathorized(Context ctx) {
        return redirect(controllers.routes.LoginController.login());
    }
}