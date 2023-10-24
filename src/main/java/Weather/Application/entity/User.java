package Weather.Application.entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    private String user_name;

    public User() {
    }

    public User(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(user_name, user.user_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_name);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                '}';
    }
}
