package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {
    @Id
    private Long id;
    @Constraints.Required
    private String type;
    @Constraints.Required
    private String fName;
    @Constraints.Required
    private String lName;
    @Constraints.Required
    private Date dob;
    @Constraints.Required
    private double salary;

    public Employee() {
    }

    public Employee(Long id, String type, String fName, String lName, Date dob, double salary) {
        this.id = id;
        this.type = type;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.salary = salary;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //Finders
    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    public static final List<Employee> findAll() {
        return Employee.find.all();
    }    

}