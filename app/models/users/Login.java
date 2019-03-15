package models.users;

public class Login {
    private String email;
    private String password;

    //Validate the id and password is in the DB
    public String validate() {
        //Method called from Employees.java
        if(Employees.authenticate(email, password) == null) {
            return "Invalid user or password";
        }
        return null;
    }

    //Getters and Setters
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}