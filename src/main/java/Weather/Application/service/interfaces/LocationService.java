package Weather.Application.service.interfaces;

import Weather.Application.entity.Location;

import java.util.List;
import java.util.Map;
public interface LocationService {

    public List<Location> getAllLocations();

    public Location addLocation(Location location);

    // not working
    String deleteLocation(String locationId);

    String updateLocation(String locationId, Location location);

    String partialUpdateLocation(String locationId, Map<String, Object> updates);
}
