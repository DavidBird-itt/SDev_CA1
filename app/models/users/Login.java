package models.users;

public class Login {
    private String id;
    private String password;

    //Validate the id and password is in the DB
    public String validate() {
        //Method called from Employees.java
        if(Employees.authenticate(id, password) == null) {
            return "Invalid user or password";
        }
        return null;
    }

    //Getters and Setters
    public String getEmpId() {
        return this.id;
    }

    public void setEmpId(String empId) {
        this.id = empId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}