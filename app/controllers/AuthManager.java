package controllers;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

public class AuthManager extends Action.Simple {
    public CompletionStage<Result> call(Http.Context ctx) {

        String id = ctx.session().get("email");

        if (id != null) {
            Employees e = Employees.getEmployeeById(id);
            if ("manager".equals(e.getRole())) {
                return delegate.call(ctx);
            }
        }

        ctx.flash().put("error", "Manager must be logged in.");

        return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));
    }
}