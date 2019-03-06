package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Project extends Model {
    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private Date start_date;
    @Constraints.Required
    private int numMembers;

    public Project() {
    }

    public Project(Long id, String name, Date start_date, int numMembers) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
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