package Weather.Application.service.interfaces;

import Weather.Application.entity.Weather;

import java.util.List;
import java.util.Map;

public interface WeatherService {

    public List<Weather> getAllWeathers();

    public Weather addWeather(Weather weather);

    String deleteWeather(String weatherId);

    String updateWeather(String weatherId, Weather weather);

    String partialUpdateWeather(String weatherId, Map<String, Object> updates);
}
