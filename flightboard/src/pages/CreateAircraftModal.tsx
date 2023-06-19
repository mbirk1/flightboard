import React, {Component, useState} from "react";
import "../styles/create-aircraft.css";
import {Modal} from "@mui/material";
import Button from "../HTMLComponents/Button";
import Label from "../HTMLComponents/Label";
import Input from "../HTMLComponents/Input";
import Select from "../HTMLComponents/Select";
import {ManufacturerService} from "../services/ManufacturerService";
import {Manufacturer} from "../models/Manufacturer";


export default class CreateAircraftModal extends Component<any, any> {
    state = {
        openModal: false,
        manufacturer: []
    }

    onClickButton = (e: { preventDefault: () => void; }) => {
        e.preventDefault()
        this.setState({openModal: true})
    }

    onCloseModal = () => {
        this.setState({openModal: false})
    }

    componentDidMount() {
        ManufacturerService.getManufacturer().then((response: any) => {
            this.setState({manufacturer: response.data})
        });
    }

    render() {
        console.log(this.state.manufacturer)
        return (
            <div>
                <Button text={"Flugzeug erstellen"} style={"create-button"} customClick={this.onClickButton}/>
                <Modal open={this.state.openModal} onClose={this.onCloseModal}>
                    <div className={"modal"}>
                        <h1 className={"header-line"}><Label text={"Neues Flugzeug anlegen"}/></h1>
                        <div className="parent">
                            <div className="model child">
                                <Label text={"Model:"} style={"modal-label"}/>
                            </div>
                            <div className="model-input child">
                                <Input type={"text"} style={"modal-size"}/>
                            </div>
                            <div className="manufacturer child">
                                <Label text={"Hersteller:"} style={"modal-label"}/>
                            </div>
                            <div className="manufacturer-input child">
                                <Select value={this.state.manufacturer} style={"modal-size"}/>
                            </div>
                            <div className="height child">
                                <Label text={"Höhe:"} style={"modal-label"}/>
                            </div>
                            <div className="height-input child">
                                <Input type={"number"} style={"modal-size"}/>
                            </div>
                            <div className="width child">
                                <Label text={"Breite:"} style={"modal-label"}/>
                            </div>
                            <div className="width-input child">
                                <Input type={"number"} style={"modal-size"}/>
                            </div>
                            <div className="length child">
                                <Label text={"Länge:"} style={"modal-label"}/>
                            </div>
                            <div className="length-input child">
                                <Input type={"number"} style={"modal-size"}/>
                            </div>
                        </div>
                    </div>
                </Modal>
            </div>
        )
    }
}
;
