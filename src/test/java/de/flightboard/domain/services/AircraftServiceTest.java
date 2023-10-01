package de.flightboard.domain.services;


import de.flightboard.IntegrationTest;
import de.flightboard.domain.entities.Aircraft;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@IntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        loader = AnnotationConfigContextLoader.class)
public class AircraftServiceTest {

    @Autowired
    private AircraftService aircraftService;

    @Test
    public void getAllAircraftTest() {
        List<Aircraft> aircraftList = this.aircraftService.findAllAircraft();

        assertEquals(2, aircraftList.size());
    }

    @Test
    public void deleteAircraftTest() {
        List<Aircraft> aircraftList = this.aircraftService.findAllAircraft();
        this.aircraftService.deleteAircraft(aircraftList.get(0).getId().toString());
        aircraftList = this.aircraftService.findAllAircraft();

        assertEquals(1, aircraftList.size());
    }
}
