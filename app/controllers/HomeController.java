package controllers;

import play.mvc.*;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public HomeController() {
    }

    public Result index() {
        return ok(index.render());
    }
}
