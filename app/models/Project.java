package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;

@Entity
public class Project extends Model {
    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String startDate;
    @Constraints.Required
    private int numMembers;

    //Many Employees work on Many Projects
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employees> emps;

    public Project() {
    }

    public Project(Long id, String name, String startDate, int numMembers) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.numMembers = numMembers;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }
  
    //Finders
    public static final Finder<Long, Project> find = new Finder<>(Project.class);

    public static final List<Project> findAll() {
        return Project.find.all();
    }     
}