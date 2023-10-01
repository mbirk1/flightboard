package de.flightboard.domain.services;

import de.flightboard.domain.entities.Aircraft;
import de.flightboard.infrastructure.AircraftRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AircraftService {

    @Inject
    private AircraftRepository aircraftRepository;

    public AircraftService(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    @Transactional
    public List<Aircraft> findAllAircraft() {
        List<Aircraft> aircrafts = new ArrayList<>();
        this.aircraftRepository.findAll().forEach(aircrafts::add);
        return aircrafts;
    }

    public void deleteAircraft(String id) {
        this.aircraftRepository.deleteById(UUID.fromString(id));
    }
}
