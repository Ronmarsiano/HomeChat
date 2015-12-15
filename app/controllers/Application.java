package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    // comment to check if works
    public Result index()

    {

        return ok(index.render("Your new application is ready."));
    }

}
