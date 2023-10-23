package Weather.Application.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_temperature")
public class Temperature extends WeatherDetails{

    private double temperature;
}
