  
package models;


import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Address extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String street1;
    @Constraints.Required
    private String street2;
    @Constraints.Required
    private String town;
    @Constraints.Required
    private String eircode;
    @Constraints.Required
    private String county;


    public Address(){

    }

    public Address(Long id, String street1, String street2, String town, String county, String eircode){
        this.id = id;
        this.street1 = street1;
        this.street2 = street2;
        this.town = town;
        this.county = county;
        this.eircode = eircode;
    }

    // Accessor methods
    public Long getId() {
            return id;
    }
    
    public void setId(Long id) {
            this.id = id;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


    public String getCounty(){
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    //Finders
    public static final Finder<Long, Address> find = new Finder<>(Address.class);

    public static final List<Address> findAll() {
        return Address.find.all();
    }

}
