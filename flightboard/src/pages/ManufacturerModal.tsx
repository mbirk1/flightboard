import Button from "../HTMLComponents/Button";
import { Modal } from "@mui/material";
import Label from "../HTMLComponents/Label";
import Input from "../HTMLComponents/Input";
import Select from "../HTMLComponents/Select";
import React, { SetStateAction, useEffect, useState } from "react";
import { getManufacturer } from "../services/ManufacturerService";

function onClickButton(e: { preventDefault: () => void }) {
  e.preventDefault();
  setOpenModal: true;
}

function onCloseModal() {
  setOpenModal: false;
}

const [openModal, setOpenModal] = useState(false);

let [manufacturer, setManufacturer] = useState([]);

export default function ManufacturerModal() {
  useEffect(() => {
    //getManufacturer().then((res: { data: SetStateAction<never[]>; }) => setManufacturer(res.data))
  }, []);

  return (
    <div>
      <Button
        text={"Flugzeug erstellen"}
        style={"create-button"}
        customClick={onClickButton}
      />
      <Modal open={openModal} onClose={onCloseModal}>
        <div className={"modal"}>
          <h1 className={"header-line"}>
            <Label text={"Neues Flugzeug anlegen"} />
          </h1>
          <div className="parent">
            <div className="model child">
              <Label text={"Model:"} style={"modal-label"} />
            </div>
            <div className="model-input child">
              <Input type={"text"} style={"modal-size"} />
            </div>
            <div className="manufacturer child">
              <Label text={"Hersteller:"} style={"modal-label"} />
            </div>
            <div className="manufacturer-input child">
              <Select value={manufacturer} style={"modal-size"} />
            </div>
            <div className="height child">
              <Label text={"Höhe:"} style={"modal-label"} />
            </div>
            <div className="height-input child">
              <Input type={"number"} style={"modal-size"} />
            </div>
            <div className="width child">
              <Label text={"Breite:"} style={"modal-label"} />
            </div>
            <div className="width-input child">
              <Input type={"number"} style={"modal-size"} />
            </div>
            <div className="length child">
              <Label text={"Länge:"} style={"modal-label"} />
            </div>
            <div className="length-input child">
              <Input type={"number"} style={"modal-size"} />
            </div>
          </div>
        </div>
      </Modal>
    </div>
  );
}
