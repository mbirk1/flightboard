package de.flightboard.domain.services;

import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import de.flightboard.domain.entities.Manufacturer;
import de.flightboard.infrastructure.ManufacturerRepository;

@Service
public class ManufacturerService {
  @Inject
  private ManufacturerRepository manufacturerRepository;

  public List<Manufacturer> findAll() {
    List<Manufacturer> manufacturers = new ArrayList<>();
    this.manufacturerRepository.findAll().iterator().forEachRemaining(e -> manufacturers.add(e));
    return manufacturers;
  }


  public void deleteManufacturer(UUID id) {
    this.manufacturerRepository.deleteById(id);
  }
}
