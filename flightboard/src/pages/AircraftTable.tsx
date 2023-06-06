import React, {Component} from "react";
import {AircraftService} from '../services/AircraftService';
import "../styles/aircraft_table.css";
import "../styles/main.css";
import Button from "../HTMLComponents/Button";
import {IconContext} from "react-icons";
import * as BsIcons from "react-icons/bs"
import {Link} from "react-router-dom";

class AircraftTable extends Component<{}, { aircrafts: any }> {

    state = {
        aircrafts: []
    };

    componentDidMount() {
        AircraftService.getAircrafts().then((response: any) => {
            this.setState({aircrafts: response.data})
        });
    }


    render() {
        function deleteAircraft(id: string) {
            AircraftService.deleteAircraft(id);
        }

        return (
            <div className="content-container">
                <h1 className="headline">Flugzeuge</h1>
                <table className="table">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Registration</th>
                        <th>Aktionen</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.aircrafts.map(
                            function (craft: any) {
                                return <tr key={craft.id}>
                                    <td> {craft.id}</td>
                                    <td> {craft.registration}</td>
                                    <td>
                                        <IconContext.Provider value={{color: "#FFF"}}>
                                            <Link to={"/edit/" + craft.id}>
                                                <Button text={<BsIcons.BsPencilFill/>} style="action-button"/>
                                            </Link>
                                            <Link to={"/home"} onClick={() => deleteAircraft(craft.id)}>
                                                <Button text={<BsIcons.BsTrash3Fill/>} style="action-button" />
                                            </Link>
                                        </IconContext.Provider>
                                    </td>
                                </tr>;
                            }
                        )
                    }
                    </tbody>
                </table>
            </div>
        )
    }
}

export default AircraftTable;
