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
  private String model;

  @Column
  private Double height;
  @Column
  private Double width;
  @Column
  private Double length;

  public Aircraft(UUID id, String model, Double height, Double width, Double length) {
    this.id = id;
    this.model = model;
    this.height = height;
    this.width = width;
    this.length = length;
  }

  public Aircraft() {
    //for JPA
  }

  public UUID getId() {
    return id;
  }

  public String getModel() {
    return model;
  }

  public Double getHeight() {
    return height;
  }

  public Double getWidth() {
    return width;
  }

  public Double getLength() {
    return length;
  }
}
