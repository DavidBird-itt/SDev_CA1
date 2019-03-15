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
    private Long id;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String role;
    @Constraints.Required
    private String fName;
    @Constraints.Required
    private String lName;
    @Constraints.Required
    private double salary;
    @Constraints.Required
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="AID")
    private Address address;


    public Employees() {
        
    }

    public Employees(Long id, String email, String role, String fName, String lName, double salary, String password) {
        this.id = id;
        this.email = email;
        this.role = role;
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

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    //Mapping gettes and setters
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address=address;
    }

    //Finders
    public static final Finder < Long, Employees > find = new Finder < > (Employees.class);


    //Identification
    public static Employees authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    //For the dynamic login, log out
    public static Employees getEmployeeById(String email) {
        if (email == null) {
            return null;
        } else {
            return find.query().where().eq("email", email).findUnique();
        }
    }



}