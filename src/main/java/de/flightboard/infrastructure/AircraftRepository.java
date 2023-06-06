package de.flightboard.infrastructure;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.flightboard.domain.entities.Aircraft;

@Repository
public interface AircraftRepository extends CrudRepository<Aircraft, UUID> {
}
