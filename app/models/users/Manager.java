package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;

@Table(name="Employee")
@DiscriminatorValue("m")

@Entity
public class Manager extends Employees {
    public Manager(){

    }

    public Manager(Long id, String email, String role, String fName, String lName, double salary, String password) {
        super(id,email, role,fName,lName,salary,password);
    }

    public static final Finder<Long, Manager> find = new Finder<>(Manager.class);

    public static final List<Manager> findAll(){
        return Manager.find.all();
    }
}