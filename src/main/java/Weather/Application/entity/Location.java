package Weather.Application.entity;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "tbl_location")
public class Location {


    @Id
    private String City;
    private Date date;
    private double latitude;
    private double longitude;




}
