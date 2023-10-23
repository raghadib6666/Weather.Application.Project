package Weather.Application.entity;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "tbl_location")
public class Location {


    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER)
    private Set<Weather> weather;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "View")
    Viewer viewer;

    // I will use the City to be my ID because it's already unique!
    @Id
    private String City;
    private Date date;
    private double latitude;
    private double longitude;

    // Constructors:
    public Location() {
    }

    public Location(String city, Date date, double latitude, double longitude) {
        City = city;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    // Getter and Setter for City:
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    // Getter and Setter for Date:
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Getter and Setter for latitude:
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    // Getter and Setter for longitude:
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                " City='" + City + '\'' +
                ", date=" + date +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Double.compare(latitude, location.latitude) == 0 && Double.compare(longitude, location.longitude) == 0 && Objects.equals(weather, location.weather) && Objects.equals(City, location.City) && Objects.equals(date, location.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weather, City, date, latitude, longitude);
    }


    public void FindCityName(String City) {
        String cityName = getCityName(latitude, longitude);
        System.out.println("City: " + City);
    }

    public static String getCityName(double latitude, double longitude) {
        if (latitude == 24.774 && longitude == 46.738) {
            return "Riyadh";
        } else if (latitude == 51.509 && longitude == 0.118) {
            return "London";
        } else if (latitude == 45.464 && longitude == 9.188) {
            return "Milan";
        } else {
            return "City not found";
        }
    }
}