package controllers;

import com.sun.javafx.tk.Toolkit.Task;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok("Hello World");
  }
  
  public static Result tasks() {
	    return ok(
	    		views.html.index.render(Task.all(), taskForm)
	    		);
	  }
	  
  public static Result newTask() {
	    return TODO;
	  }
	  
  public static Result deleteTask(Long id) {
	    return TODO;
	  }
  
  static Form<Task> taskForm = Form.form(Task.class);
  

}

