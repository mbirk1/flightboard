import React, { Component } from "react";
import "../styles/aircraft_table.css";
import "../styles/main.css";
import Button from "../HTMLComponents/Button";
import { IconContext } from "react-icons";
import * as BsIcons from "react-icons/bs";
import { Link } from "react-router-dom";
import CreateAircraftModal from "./CreateAircraftModal";
import { deleteAircraft, getAircrafts } from "../services/AircraftService";
import { Aircraft } from "../models/aircraft_model";

class AircraftTable extends Component<{}, { aircraft: any }> {
  state = {
    aircraft: [],
    openModal: false,
  };

  componentDidMount() {
    getAircrafts().then((result: Aircraft[]) => {
      this.setState({ aircraft: result });
    });
    this.setState({ aircraft: this.state.aircraft });
  }

  render() {
    function onClickDeleteAircraft(id: string) {
      deleteAircraft(id);
    }

    return (
      <div className="content-container">
        <h1 className="headline">Flugzeuge</h1>
        <CreateAircraftModal></CreateAircraftModal>
        <table className="table">
          <thead>
            <tr>
              <th>ID</th>
              <th>Model</th>
              <th>Hersteller</th>
              <th>Höhe</th>
              <th> Breite</th>
              <th>Länge</th>
              <th>Aktionen</th>
            </tr>
          </thead>
          <tbody>
            {this.state.aircraft.map(function (craft: any) {
              return (
                <tr key={craft.id}>
                  <td id={"id"}>{craft.id}</td>
                  <td>{craft.model}</td>
                  <td>{craft.manufacturer}</td>
                  <td>{craft.height}</td>
                  <td>{craft.width}</td>
                  <td>{craft.length}</td>
                  <td>
                    <div id={"buttons"}>
                      <IconContext.Provider value={{ color: "#FFF" }}>
                        <Link to={"/edit/" + craft.id}>
                          <Button
                            text={<BsIcons.BsPencilFill />}
                            style_type="action-button"
                          />
                        </Link>
                        <Link
                          to={"/home"}
                          onClick={() => onClickDeleteAircraft(craft.id)}
                        >
                          <Button
                            text={<BsIcons.BsTrash3Fill />}
                            style_type="action-button"
                          />
                        </Link>
                      </IconContext.Provider>
                    </div>
                  </td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    );
  }
}

export default AircraftTable;
