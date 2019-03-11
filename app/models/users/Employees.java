package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employees {
    @Id
    private Long id;
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

    public Employees() {
    }

    public Employees(Long id, String type, String fName, String lName, double salary, String password) {
        this.id = id;
        this.type = type;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    public static final Finder<Long, Employees> find = new Finder<>(Employees.class);

    public static final List<Employees> findAll() {
        return Employees.find.all();
    }    

    //Identification
    public static Employees authenticate(String empId, String password) {
        return find.query().where().eq("empId", empId).eq("password", password).findUnique();
    }

    //For the dynamic login, log out
    public static Employees getEmployeeById(String id) {
        if (id == null) {
            return null;
        } else {
            return find.query().where().eq("empId", id).findUnique();
        }
    } 

}