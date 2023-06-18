package de.flightboard.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity(name = "tab_flight_manufacturer")
public class Manufacturer {
  @Id
  private UUID id;

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }
}
