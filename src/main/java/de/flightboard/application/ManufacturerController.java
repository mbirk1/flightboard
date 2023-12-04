package de.flightboard.application;

import de.flightboard.domain.entities.Manufacturer;
import de.flightboard.domain.services.ManufacturerService;
import jakarta.inject.Inject;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
