package Weather.Application.service.implementations;

import Weather.Application.entity.Location;
import Weather.Application.repository.LocationRepository;
import Weather.Application.service.interfaces.LocationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public static List<Location> getAllLocations() {
        return LocationRepository.findAll();
    }

}
