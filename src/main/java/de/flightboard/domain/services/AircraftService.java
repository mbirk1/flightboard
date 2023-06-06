package de.flightboard.domain.services;

import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Service;

import de.flightboard.domain.entities.Aircraft;
import de.flightboard.infrastructure.AircraftRepository;

@Service
public class AircraftService {

  @Inject
  private AircraftRepository aircraftRepository;

  public List<Aircraft> findAllAircraft(){
    List<Aircraft> aircrafts = new ArrayList<>();
    this.aircraftRepository.findAll().forEach(aircrafts::add);
    return aircrafts;
  }

  public void deleteAircraft(String id){
    this.aircraftRepository.deleteById(UUID.fromString(id));
  }
}
