package Weather.Application.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {


    @Test
    void getCityName() throws InvalidCoordinatesException {

        // Test case 1
        assertEquals("Riyadh", Location.getCityName(24.774, 46.738));

        // Test case 2
        assertEquals("London", Location.getCityName(51.509, 0.118));

        // Test case 3
        assertEquals("Milan", Location.getCityName(45.464, 9.188));

        // Test case 4 - City not found
        assertEquals("City not found", Location.getCityName(0.0, 0.0));
    }
}