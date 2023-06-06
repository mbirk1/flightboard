package de.flightboard.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity(name = "tab_flight_aircraft")
public class Aircraft {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;

  @Column
  private String registration;

  public Aircraft(UUID id, String registration) {
    this.id = id;
    this.registration = registration;
  }

  public Aircraft(String registration) {
    this.registration = registration;
  }

  public Aircraft() {
    //for JPA
  }

  public UUID getId() {
    return id;
  }

  public String getRegistration() {
    return registration;
  }
}
