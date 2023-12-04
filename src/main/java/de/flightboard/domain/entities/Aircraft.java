package de.flightboard.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

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

  @ManyToOne
  @JoinColumn(name = "manufacturer_id", nullable = false)
  private Manufacturer manufacturer;

  public Aircraft(UUID id, String model, Double height, Double width, Double length, Manufacturer manufacturer) {
    this.id = id;
    this.model = model;
    this.height = height;
    this.width = width;
    this.length = length;
    this.manufacturer = manufacturer;
  }

  public Aircraft() {
    this.id = UUID.randomUUID();
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

  public Manufacturer getManufacturer() {
    return manufacturer;
  }

  private void setManufacturer(Manufacturer manufacturer) {
    this.manufacturer = manufacturer;
  }

  private void setModel(String model) {
    this.model = model;
  }

  private void setHeight(Double height) {
    this.height = height;
  }

  private void setWidth(Double width) {
    this.width = width;
  }

  private void setLength(Double length) {
    this.length = length;
  }

  public static class AircraftBuilder {
    private Aircraft aircraft = new Aircraft();

    public AircraftBuilder widthModel(String model) {
      this.aircraft.setModel(model);
      return this;
    }

    public AircraftBuilder withHeigth(Double heigth) {
      this.aircraft.setHeight(heigth);
      return this;
    }

    public AircraftBuilder withWidth(Double width) {
      this.aircraft.setWidth(width);
      return this;
    }

    public AircraftBuilder withLength(Double length) {
      this.aircraft.setLength(length);
      return this;
    }

    public AircraftBuilder withManufacturer(Manufacturer manufacturer) {
      this.aircraft.setManufacturer(manufacturer);
      return this;
    }

    private void validate() {
      if (this.aircraft.getHeight() == null) {
        this.aircraft.setHeight(0.0);
      }
      if (this.aircraft.getLength() == null) {
        this.aircraft.setLength(0.0);
      }
      if (this.aircraft.getWidth() == null) {
        this.aircraft.setWidth(0.0);
      }
      if (this.aircraft.getModel() == null || this.aircraft.getModel().trim().isEmpty()) {
        throw new IllegalArgumentException("Model can't be null or empty");
      }
    }

    public Aircraft build() {
      validate();
      Aircraft returnValue = this.aircraft;
      this.aircraft = new Aircraft();
      return returnValue;
    }
  }
}
