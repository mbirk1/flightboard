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
    //for JPA
  }

  public Manufacturer(UUID uuid, String name) {
    this.id = uuid;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public UUID getId() {
    return this.id;
  }
}
