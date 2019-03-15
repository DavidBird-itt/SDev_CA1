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
    public Worker(){

    }

    public Worker(String id, String role, String fName, String lName, double salary, String password) {
        super(id,role,fName,lName,salary,password);
    }

    public static final Finder<Long, Worker> find = new Finder<>(Worker.class);

    public static final List<Worker> findAll(){
        return Worker.find.all();
    }
}