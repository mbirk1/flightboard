package de.flightboard.application;

import de.flightboard.domain.entities.Aircraft;
import de.flightboard.domain.services.AircraftService;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/aircraft")
public class AircraftController {

    @Inject
    private AircraftService aircraftService;

    private final static Logger LOG = LoggerFactory.getLogger(AircraftController.class);

    public AircraftController(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }

    @GetMapping
    public List<Aircraft> findAll() {
        LOG.info("Find all saved aircrafts");
        return this.aircraftService.findAllAircraft();
    }

    @DeleteMapping(path = "/{id}")
    public void deleteAircraft(@PathVariable String id) {
        LOG.info("Trying to delete aircraft.");
        this.aircraftService.deleteAircraft(id);
    }

}
