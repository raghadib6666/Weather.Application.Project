package Weather.Application.service.implementations;

import Weather.Application.entity.Location;
import Weather.Application.repository.LocationRepository;
import Weather.Application.service.interfaces.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location addLocation(Location location){
        return locationRepository.save(location);
    }

    @Override
    public String updateLocation(String locationId, Location location) {
        Optional<Location> locationFound = locationRepository.findById(locationId);
        if(locationFound.isPresent()){
        location.setLocationId(location.getLocationId());
            locationRepository.save(location);
        return "Location updated";}
        else{
            return "Location with ID: "+ locationId + " not found";
        }
    }

    @Override
    public String partialUpdateLocation(String locationId, Map<String, Object> updates) {
        Optional<Location> locationFound = locationRepository.findById(locationId);
        if (locationFound.isPresent()){
        Location existingLocation = locationFound.get();

            if (updates.containsKey("City")){
                existingLocation.setLocationId((Integer) updates.get("location ID"));
            }

            locationRepository.save(existingLocation);
            return "Location updated using patch";
        } else
        {
            return "Location not found";
        }
    }

    @Override
    public String deleteLocation(String locationId) {
        if (locationRepository.existsById(locationId)){
            locationRepository.deleteById(locationId);
            return "Location deleted successfully!";
        }else {
            return "Location not found";
        }

    }

}



