package de.flightboard.domain.services;

import de.flightboard.application.AircraftController;
import de.flightboard.domain.entities.Aircraft;
import de.flightboard.infrastructure.AircraftRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AircraftService {

    @Inject
    private AircraftRepository aircraftRepository;

    private final static Logger LOG = LoggerFactory.getLogger(AircraftController.class);

    public AircraftService(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    @Transactional
    public List<Aircraft> findAllAircraft() {
        List<Aircraft> aircrafts = new ArrayList<>();
        this.aircraftRepository.findAll().forEach(aircrafts::add);
        LOG.info("Found "+aircrafts.size()+" aircrafts.");
        return aircrafts;
    }

    public void deleteAircraft(String id) {
        this.aircraftRepository.deleteById(UUID.fromString(id));
    }
}
