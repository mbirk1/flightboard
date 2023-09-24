import React, { Component, useState } from "react";
import "../styles/create-aircraft.css";
import { Modal } from "@mui/material";
import Button from "../HTMLComponents/Button";
import Label from "../HTMLComponents/Label";
import Input from "../HTMLComponents/Input";
import Select from "../HTMLComponents/Select";
import { getManufacturer } from "../services/ManufacturerService";
import { createAircraft, getAircrafts } from "../services/AircraftService";
import { Manufacturer } from "../models/manufacturer_model";

export default class CreateAircraftModal extends Component<any, any> {
  state = {
    openModal: false,
    manufacturer: [],
  };

  onClickButtonOpenModal = (e: { preventDefault: () => void }) => {
    e.preventDefault();
    this.setState({ openModal: true });
  };

  onCloseModal = () => {
    this.setState({ openModal: false });
  };

  componentDidMount() {
    getManufacturer().then((result: Manufacturer[]) => {
      this.setState({ manufacturer: result });
    });
  }

  createAircraftFromModal() {
    createAircraft();
  }

  render() {
    const manu_names = this.state.manufacturer;
    return (
      <div>
        <Button
          text={"Flugzeug erstellen"}
          style_type={"create-button"}
          customClick={this.onClickButtonOpenModal}
        />
        <Modal open={this.state.openModal} onClose={this.onCloseModal}>
          <div className={"modal"}>
            <h1 className={"header-line"}>
              <Label text={"Neues Flugzeug anlegen"} />
            </h1>
            <div className="parent">
              <div className="model child">
                <Label text={"Model:"} style_type={"modal-label"} />
              </div>
              <div className="model-input child">
                <Input type={"text"} style_type={"modal-size"} />
              </div>
              <div className="manufacturer child">
                <Label text={"Hersteller:"} style_type={"modal-label"} />
              </div>
              <div className="manufacturer-input child">
                <Select
                  value={this.state.manufacturer}
                  style_type={"modal-size"}
                />
              </div>
              <div className="height child">
                <Label text={"Höhe:"} style_type={"modal-label"} />
              </div>
              <div className="height-input child">
                <Input type={"number"} style_type={"modal-size"} />
              </div>
              <div className="width child">
                <Label text={"Breite:"} style_type={"modal-label"} />
              </div>
              <div className="width-input child">
                <Input type={"number"} style_type={"modal-size"} />
              </div>
              <div className="length child">
                <Label text={"Länge:"} style_type={"modal-label"} />
              </div>
              <div className="length-input child">
                <Input type={"number"} style_type={"modal-size"} />
              </div>
              <Button
                text={"Erstellen"}
                style_type={"create-button"}
                customClick={this.createAircraftFromModal()}
              />
            </div>
          </div>
        </Modal>
      </div>
    );
  }
}
