package Weather.Application.repository;
import Weather.Application.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, String> {



}
