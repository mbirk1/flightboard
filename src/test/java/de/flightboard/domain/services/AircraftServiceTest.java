package de.flightboard.domain.services;


import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import de.flightboard.AircraftFactory;
import de.flightboard.IntegrationTest;
import de.flightboard.domain.entities.Aircraft;

@IntegrationTest
public class AircraftServiceTest {
  private static final int CREATE_AIRCRAFT_AMOUNT = 2;

  @Inject
  private AircraftFactory aircraftFactory;

  @Autowired
  private AircraftService aircraftService;

  @BeforeEach
  private void createAircrafts() {
    for (int i = 0; i < CREATE_AIRCRAFT_AMOUNT; i++) {
      aircraftFactory.generateAircraft("A380", 0.0, 0.0, 0.0);
    }
  }


  @Test
  public void getAllAircraftTest() {
    List<Aircraft> aircraftList = aircraftService.findAllAircraft();
    assertEquals(aircraftList.size(), 2);
  }
}
