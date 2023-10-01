package de.flightboard.application;

import de.flightboard.domain.entities.Aircraft;
import de.flightboard.domain.services.AircraftService;
import jakarta.inject.Inject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/aircraft")
public class AircraftController {

    @Inject
    private AircraftService aircraftService;

    public AircraftController(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }

    @GetMapping
    public List<Aircraft> findAll() {
        List<Aircraft> aircrafts = this.aircraftService.findAllAircraft();
        return aircrafts;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteAircraft(@PathVariable String id) {
        this.aircraftService.deleteAircraft(id);
    }

}
