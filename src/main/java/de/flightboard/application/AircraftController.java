package de.flightboard.application;

import jakarta.inject.Inject;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.flightboard.domain.entities.Aircraft;
import de.flightboard.domain.services.AircraftService;

@RestController
@RequestMapping(path = "/aircraft")
public class AircraftController {

  @Inject
  private AircraftService aircraftService;

  @GetMapping
  public List<Aircraft> findAll() {
    List<Aircraft> aircrafts = this.aircraftService.findAllAircraft();
    return aircrafts;
  }

  @DeleteMapping(path = "/{id}")
  public void deleteAircraft(@PathVariable String id){
    this.aircraftService.deleteAircraft(id);
  }

}
