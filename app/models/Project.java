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
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Constraints.Required
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    
    @Constraints.Required
    private int numMembers;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employees> emps;

    private List<String> empSelect = new ArrayList<String>();

    public Project() {
    }

    public Project(Long id, String name, Date startDate, Date dueDate, int numMembers) {
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
        return String.format("%1$td %1$tB %1$tY", startDate);
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDueDate() {
        return String.format("%1$td %1$tB %1$tY", dueDate);
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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
    
    //ManyToMany Mapping
    public List<Employees> getEmps() {
        return emps;
    }
    public void setEmps(List<Employees> emps) {
        this.emps = emps;
    }
    public List<String> getEmpSelect() {
        return empSelect;
    }
    public void setEmpSelect(List<String> empSelect) {
        this.empSelect = empSelect;
    }
}