package Weather.Application.entity;
import jakarta.persistence.*;


import java.util.*;

@Entity
@Table(name = "tbl_location")

public class Location {


    @OneToMany(mappedBy = "location")
    private Set<Weather> weather;

    @ManyToOne
    @JoinColumn(name = "viewer")
    private Viewer viewer;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locationId;
    private String city;
    private double latitude;
    private double longitude;

    // Constructors:
    public Location() {
    }



//    public String generateLocation() {
//        // Generate a unique ID when a new Location object is created
//        return UUID.randomUUID().toString();
//    }

    // Getter and Setter for City:

    public Set<Weather> getWeather() {
        return weather;
    }

    public void setWeather(Set<Weather> weather) {
        this.weather = weather;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Double.compare(latitude, location.latitude) == 0 && Double.compare(longitude, location.longitude) == 0 && Objects.equals(weather, location.weather) && Objects.equals(viewer, location.viewer) && Objects.equals(locationId, location.locationId) && Objects.equals(city, location.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weather, viewer, locationId, city, latitude, longitude);
    }

    @Override
    public String toString() {
        return "Location{" +
                "weather=" + weather +
                ", viewer=" + viewer +
                ", locationId='" + locationId + '\'' +
                ", City='" + city + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
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