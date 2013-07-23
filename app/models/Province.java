package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.validation.Constraints.*;

@Entity
@Table()
public class Province extends Model {

	@Id
	public Long id;
	
	@Required
	public String name;
	
	public static List<Province> all() {
	    return new ArrayList<Province>();
	}
	
	public static Finder<Long,Province> find = new Finder(Long.class, Province.class);
	
 	public static void create(Province province) {
 		province.save();
 	}
	
 	public static void delete(Long id) {
 		find.ref(id).delete();
  	}

}
