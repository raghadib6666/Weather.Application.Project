package Weather.Application.repository;
import Weather.Application.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, String> {

    Location FindCityName(String cityName) ;
    Location findAll();


}
