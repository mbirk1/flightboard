package de.flightboard;

import org.springframework.stereotype.Component;

import de.flightboard.domain.entities.Aircraft;
import de.flightboard.infrastructure.AircraftRepository;

@Component
public class AircraftFactory {

  private AircraftRepository aircraftRepository;

  public AircraftFactory(AircraftRepository aircraftRepository) {
    this.aircraftRepository = aircraftRepository;
  }

  public void generateAircraft(String model, Double heigth, Double length, Double width) {
    Aircraft.AircraftBuilder aircraftBuilder = new Aircraft.AircraftBuilder();
    Aircraft aircraft = aircraftBuilder.widthModel(model).withHeigth(heigth).withLength(length).withWidth(width).build();
    this.aircraftRepository.save(aircraft);
  }
}
