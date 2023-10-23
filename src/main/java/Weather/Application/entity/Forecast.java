package Weather.Application.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_forecast")
public class Forecast extends WeatherDetails{

    private String conditions;

}
