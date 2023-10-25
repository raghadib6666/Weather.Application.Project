package Weather.Application.service.implementations;

import Weather.Application.entity.Location;
import Weather.Application.entity.Weather;
import Weather.Application.repository.WeatherRepository;
import Weather.Application.service.interfaces.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;
    @Override
    public List<Weather> getAllWeathers() {
        return weatherRepository.findAll();
    }

    @Override
    public Weather addWeather(Weather weather) {
        return weatherRepository.save(weather);
    }

    @Override
    public String deleteWeather(String weatherId) {
        if (weatherRepository.existsById(weatherId)){
            weatherRepository.deleteById(weatherId);
            return "Weather details deleted successfully!";
        }else {
            return "Weather details not found";
        }
    }

    @Override
    public String updateWeather(String weatherId, Weather weather) {
        Optional<Weather> weatherFound = weatherRepository.findById(weatherId);
        if(weatherFound.isPresent()){
            weather.setWeatherId(weather.getWeatherId());
            weatherRepository.save(weather);
            return "Weather details updated";}
        else{
            return "Weather details with ID: "+ weather + " not found";
        }
    }

    @Override
    public String partialUpdateWeather(String weatherId, Map<String, Object> updates) {
        Optional<Weather> weatherFound = weatherRepository.findById(weatherId);
        if (weatherFound.isPresent()){
            Weather existingWeather = weatherFound.get();

            if (updates.containsKey("City")){
                existingWeather.setWeatherId((Integer) updates.get("Weather ID"));
            }

            weatherRepository.save(existingWeather);
            return "Weather details updated using patch";
        } else
        {
            return "Weather details not found";
        }
    }
}
