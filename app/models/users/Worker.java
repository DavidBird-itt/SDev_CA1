package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;

@Table(name="Employees")
@DiscriminatorValue("w")

@Entity
public class Worker extends Employees {

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "workers")
    private List <Project> projects;

    public Worker(){

    }

    public Worker(String id, String role, String fName, String lName, double salary, String password) {
        super(id,role,fName,lName,salary,password);
    }

    public static final Finder<Long, Worker> find = new Finder<>(Worker.class);

    public static final List<Worker> findAll(){
        return Worker.find.all();
    }

        
    //For many to many mapping
    public static Map < String, String > options() {
        LinkedHashMap < String, String > options = new LinkedHashMap();

        // Get all the Employees from the database and add them to the options hash map
        for (Worker w: Worker.findAll()) {
            options.put(w.getId().toString(), w.getfName());
        }
        return options;
    }

    public static boolean inWorkers(String employee, Long product) {
        return find.query().where().eq("prodect.id", product).eq("id", employee).findList().size() > 0;
    }



}