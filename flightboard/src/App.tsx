import React from 'react';
import Home from "./pages/Home";

import "./styles/main.css"
import {Navigate, Route, Routes} from "react-router-dom";
import Navigation from "./pages/Navigation";
import FlightTable from "./pages/FlightTable";
import AircraftTable from "./pages/AircraftTable";

function App() {
    return (
        <div className="App">
            <nav>
                    <Navigation/>
                    <Routes>
                        <Route path="/" element={<Navigate to="/home" />} />
                        <Route path="/home" Component={Home} />
                        <Route path="/flights" Component={FlightTable} />
                        <Route path="/aircrafts" Component={AircraftTable} />
                        <Route/>
                    </Routes>
            </nav>
        </div>
    );
}

export default App;
