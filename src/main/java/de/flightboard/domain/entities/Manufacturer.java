package de.flightboard.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity(name = "tab_flight_manufacturer")
public class Manufacturer {
  @Id
  private UUID id;

  @Column(name = "manufacturer_name")
  private String name;

  public Manufacturer() {
  }

  public Manufacturer(UUID id, String name) {
    this.id = id;
    this.name = name;
  }

  public UUID getId() {
    return this.id;
  }

  public String getName() {
    return name;
  }
}
