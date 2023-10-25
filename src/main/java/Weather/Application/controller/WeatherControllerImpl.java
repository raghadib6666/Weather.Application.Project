package Weather.Application.controller;

import Weather.Application.entity.Location;
import Weather.Application.entity.Weather;
import Weather.Application.service.implementations.LocationServiceImpl;
import Weather.Application.service.implementations.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class WeatherControllerImpl {

    @Autowired
    private WeatherServiceImpl weatherService;

    @GetMapping("/weather")
    @ResponseStatus(HttpStatus.OK)
    public List<Weather> getAllWeathers(){
        return weatherService.getAllWeathers();
    }

    @PostMapping("/weathers/add")
    public ResponseEntity<String> addWeather(@RequestBody Weather weather) {
        try {
            Weather savedWeathers = weatherService.addWeather(weather);
            String message = "Weather details added successfully!";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            String errorMessage = "Failed to add weather detail: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }


    @DeleteMapping("/weather/delete/{weatherId}")
    public String deleteWeather(@PathVariable String weatherId){
        return weatherService.deleteWeather(weatherId);
    }

    @PutMapping("/weather/update/{weatherId}")
    public String updateWeather(@PathVariable String weatherId, @RequestBody Weather weather){

        return weatherService.updateWeather(weatherId, weather);
    }

    @PatchMapping("/weather/PatchUpdate/{weatherId}")
    public String updateWeather(@PathVariable String weatherId, @RequestBody Map<String, Object> updates){

        return weatherService.partialUpdateWeather(weatherId, updates);
    }

}
