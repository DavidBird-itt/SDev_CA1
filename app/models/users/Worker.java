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

    public Worker(Long id, String email, String role, String fName, String lName, double salary, String password) {
        super(id,email, role,fName,lName,salary,password);
    }

    public static final Finder<Long, Worker> find = new Finder<>(Worker.class);

    public static final List<Worker> findAll(){
        return Worker.find.all();
    }

        
    //For many to many mapping
    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> p) {
        this.projects = p;
    }

    public static Map < String, String > options() {
        LinkedHashMap < String, String > options = new LinkedHashMap();

        // Get all the Employees from the database and add them to the options hash map
        for (Worker w: Worker.findAll()) {
            options.put(w.getId().toString(), w.getfName());
        }
        return options;
    }

    public static boolean inWorkers(Long employee, Long product) {
        return find.query().where().eq("prodect.id", product).eq("id", employee).findList().size() > 0;
    }

    public void raise(){
        final double RAISE_AMOUNT = .5;
        //this.salary += this.salary* RAISE_AMOUNT;
        double s = super.getSalary();
        s += s* RAISE_AMOUNT;

        super.setSalary(s);
    }

}