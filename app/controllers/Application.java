package controllers;

import models.Province;
import play.data.Form;
import play.mvc.*;

public class Application extends Controller {
	
	static Form<Province> provinceForm = Form.form(Province.class);
  
    public static Result index() {
        return redirect(routes.Application.listProvince());
    }
    
    public static Result listProvince() {
        return ok(views.html.index.render(Province.all(), provinceForm));
    }
    
    public static Result deleteProvince(long id){
    	return TODO;
    }
    
    public static Result newProvince(){
    	Form<Province> filledForm = provinceForm.bindFromRequest();
    	  if(filledForm.hasErrors()) {
    	    return badRequest(
    	      views.html.index.render(Province.all(), filledForm)
    	    );
    	  } else {
    		  Province.create(filledForm.get());
    	    return redirect(routes.Application.listProvince());  
    	  }
    }
  
}
