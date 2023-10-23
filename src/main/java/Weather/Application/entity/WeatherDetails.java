package Weather.Application.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_weatherDetails")
public class WeatherDetails {

    private int humidity;
    private double windSpeed;

}
