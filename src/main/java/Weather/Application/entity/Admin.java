package Weather.Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "tbl_admin")
@Entity
public class Admin extends User{

    private String password;
    private String role = "Admin";


    public Admin() {
    }

    public Admin(String user_name, String password, String role) {
        super(user_name);
        this.password = password;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
