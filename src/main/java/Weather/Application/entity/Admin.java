package Weather.Application.entity;

public class Admin extends User{

    private String role = "Admin";


    public Admin() {
    }

    public Admin(String user_name, String role) {
        super(user_name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
