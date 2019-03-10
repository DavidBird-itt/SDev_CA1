package models.users;

public class Login {
    private String empId;
    private String password;

    //Validate the email and password is in the DB
    public String validate() {
        //Method called from User.java
        if(Employee.authenticate(empId, password) == null) {
            return "Invalid user or password";
        }
        return null;
    }

    //Getters and Setters
    public String getEmpId() {
        return this.empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}