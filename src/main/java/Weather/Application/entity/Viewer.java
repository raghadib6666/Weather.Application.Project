package Weather.Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Objects;
import java.util.Set;
@Table(name = "tbl_viewer")
@Entity
public class Viewer extends User{


    @OneToMany(mappedBy = "viewer", fetch = FetchType.EAGER)
    private Set<Location> locations;
    private String role = "Admin";

    public Viewer() {
    }

    public Viewer(String user_name, String role) {
        super(user_name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Viewer viewer = (Viewer) o;
        return Objects.equals(role, viewer.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), role);
    }

    @Override
    public String toString() {
        return "Viewer{" +
                "role='" + role + '\'' +
                '}';
    }
}
