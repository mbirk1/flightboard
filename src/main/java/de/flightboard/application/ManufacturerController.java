package de.flightboard.application;

import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.flightboard.domain.entities.Manufacturer;
import de.flightboard.domain.services.ManufacturerService;

@RestController
@RequestMapping(path = "/manufacturer")
public class ManufacturerController {
  @Inject
  private ManufacturerService manufacturerService;

  @GetMapping
  public List<Manufacturer> findAll() {
    List<Manufacturer> manufacturers = this.manufacturerService.findAll();
    return manufacturers;
  }

  @DeleteMapping(path = "/{id}")
  public void deleteManufacturer(@PathVariable String id) {
    this.manufacturerService.deleteManufacturer(UUID.fromString(id));
  }
}
