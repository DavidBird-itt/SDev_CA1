package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;

@Entity

@Table(name="employees")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
@DiscriminatorValue("e")

public class Employees extends Model {
    @Id
    private String id;
    @Constraints.Required
    private String type;
    @Constraints.Required
    private String fName;
    @Constraints.Required
    private String lName;
    @Constraints.Required
    private double salary;
    @Constraints.Required
    private String password;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "emps")
    private List <Project> projects;



    public Employees() {}

    public Employees(String id, String type, String fName, String lName, double salary, String password) {
        this.id = id;
        this.type = type;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Finders
    public static final Finder < Long, Employees > find = new Finder < > (Employees.class);


    //Identification
    public static Employees authenticate(String empId, String password) {
        return find.query().where().eq("id", empId).eq("password", password).findUnique();
    }

    //For the dynamic login, log out
    public static Employees getEmployeeById(String id) {
        if (id == null) {
            return null;
        } else {
            return find.query().where().eq("id", id).findUnique();
        }
    }

    /*
    //For many to many mapping
    public static Map < String, String > options() {
        LinkedHashMap < String, String > options = new LinkedHashMap();

        // Get all the Employees from the database and add them to the options hash map
        for (Employees e: Employees.findAll()) {
            options.put(e.getId().toString(), e.getfName());
        }
        return options;
    }

    public static boolean inEmployees(String employee, Long product) {
        return find.query().where().eq("prodect.id", product).eq("id", employee).findList().size() > 0;
    }
*/
}