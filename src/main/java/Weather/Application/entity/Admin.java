package Weather.Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "tbl_admin")
@Entity
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
