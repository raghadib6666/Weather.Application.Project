package Weather.Application.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tbl_weather")
public class Weather {

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "City_location")
    Location location;
    private int humidity;
    private double windSpeed;
    private String conditions;
    private double temperature;

    public Weather() {
    }

    public Weather(Location location, int humidity, double windSpeed, String conditions, double temperature) {
        this.location = location;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.conditions = conditions;
        this.temperature = temperature;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return humidity == weather.humidity && Double.compare(windSpeed, weather.windSpeed) == 0 && Double.compare(temperature, weather.temperature) == 0 && Objects.equals(location, weather.location) && Objects.equals(conditions, weather.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, humidity, windSpeed, conditions, temperature);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "location=" + location +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", conditions='" + conditions + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
