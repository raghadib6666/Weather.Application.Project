package Weather.Application.controller;

import Weather.Application.entity.Location;
import Weather.Application.repository.LocationRepository;
import Weather.Application.service.implementations.LocationServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static Weather.Application.entity.Location.getCityName;

@RestController
public class LocationControllerImpl {
@Autowired
private LocationServiceImpl locationService;

// a get method to return all locations
    @GetMapping("/locations")
    @ResponseStatus(HttpStatus.OK)
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }


//  post method to add new location
    @PostMapping("/locations/add")
    public ResponseEntity<String> addLocation(@RequestBody @Valid Location location) {
        try {
            Location savedLocation = locationService.addLocation(location);
            String message = "Location added successfully!";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            String errorMessage = "Failed to add location: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }

// method will delete a location

    @DeleteMapping("/location/delete/{locationId}")
    public String deleteLocation(@PathVariable String locationId){
        return locationService.deleteLocation(locationId);
    }


// method will update all locations
    @PutMapping("/location/update/{locationId}")
    public String updateLocation(@PathVariable String locationId, @RequestBody Location location){

        return locationService.updateLocation(locationId, location);
    }


// method will update a location
    @PatchMapping("/location/PatchUpdate/{locationId}")
    public String updateLocation(@PathVariable String locationId, @RequestBody Map<String, Object> updates){

        return locationService.partialUpdateLocation(locationId, updates);
    }


}
