package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;

@Entity
public class Department extends Model {

    @Id
    private Long id;
    @Constraints.Required
    String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List < Employees > employees;


    public Department() {}

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Mapped Getters and setters
    public List < Employees > getEmployees() {
        return this.employees;
    }

    public void setEmployees(List < Employees > e) {
        this.employees = e;
    }

    //Finders
    public static final Finder < Long, Department > find = new Finder < > (Department.class);

    public static final List < Department > findAll() {
        return Department.find.all();
    }
}