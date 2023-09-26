package de.flightboard.domain.services;


import de.flightboard.FlightboardApplication;
import de.flightboard.domain.entities.Aircraft;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightboardApplication.class)
@ActiveProfiles("test-containers")
public class AircraftServiceTest {
    @Autowired
    private AircraftService aircraftService;

    @Test
    public void getAllAircraftTest() {
        List<Aircraft> aircraftList = aircraftService.findAllAircraft();
        assertEquals(aircraftList.size(), 2);
    }
}
