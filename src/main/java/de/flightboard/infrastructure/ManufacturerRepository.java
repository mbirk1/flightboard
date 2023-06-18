package de.flightboard.infrastructure;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.flightboard.domain.entities.Manufacturer;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, UUID> {
}
