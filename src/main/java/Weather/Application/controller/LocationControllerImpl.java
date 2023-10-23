package Weather.Application.controller;

import Weather.Application.entity.Location;
import Weather.Application.service.implementations.LocationServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static Weather.Application.entity.Location.getCityName;

@RestController
public class LocationControllerImpl {


    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    public List<Location> getAllCourses(){
        //return courseRepository.findAll();
//        return LocationServiceImpl.getAllCourses();
        return LocationServiceImpl.getAllLocations();
    }

}
