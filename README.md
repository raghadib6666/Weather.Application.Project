# Weather.Application.Project🌦️

The Weather App is designed to provide weather information for different 
locations. With a focus on simplicity and efficiency, viewers can manage their locations, 
retrieve weather details, and stay informed about temperature, humidity, wind Speed, and conditions!




## Class Diagram:

![myWeatherApp drawio](https://github.com/raghadib6666/Weather.Application.Project/assets/145933448/e42b92a8-e28e-42d1-93eb-466d2ac56868)




## Setup:

1) Clone the repository.
2) Configure your database settings in application.properties.
3) Run the application.




## Technologies Used:

1) Jakarta Persistence API (JPA).
2) Spring Boot.
3) Spring Data JPA.
4) MySQL Workbench.
5) IntelliJ IDEA Community Edition.




## Controllers and Routes Structure:

**Location Controller** 
  
- Get All Locations: 'GET /locations'
- Add Location: 'POST /locations/add'
- Delete Location: 'DELETE /location/delete/{locationId}'
- Update Location: 'PUT /location/update/{locationId}'
- Partial Update Location: 'PATCH /location/PatchUpdate/{locationId}'

**Viewer Controller**

- Add Viewer: 'POST /viewer/add'

**Weather Controller**

- Get All Weathers: 'GET /weather'
- Add Weather: 'POST /weathers/add'
- Delete Weather: 'DELETE /weather/delete/{weatherId}'
- Update Weather: 'PUT /weather/update/{weatherId}'
- Partial Update Weather: 'PATCH /weather/PatchUpdate/{weatherId}'


**Note: Replace {locationId} and {weatherId} with the actual IDs when making requests.**




## Extra Links:

**Trello**
<br> https://trello.com/b/uN5zGpiG/weather-application

**Presentation Slides**
<br> 



## Future Work:

**User Interface (UI):**
<br> Develop a user-friendly web interface or mobile app to allow users to interact with the application visually. Use modern frontend frameworks like React or Angular for a responsive and dynamic user experience.

**Historical Weather Data:**
<br> Extend the application to store and provide historical weather data. Implement features to allow users to view past weather conditions for specific locations.

**Notifications and Alerts:**
<br> Integrate a notification system to alert users about conditions weather changes or updates for their specified locations. This could include email alerts, push notifications, or SMS notifications.




## Resources:

https://github.com/raneemr05/springdatajpa
