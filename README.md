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

- Location Controller -
  
- Get All Locations: 'GET /locations'
- Add Location: 'POST /locations/add'
- Delete Location: 'DELETE /location/delete/{locationId}'
- Update Location: 'PUT /location/update/{locationId}'
- Partial Update Location: 'PATCH /location/PatchUpdate/{locationId}'

