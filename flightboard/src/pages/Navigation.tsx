import React, { useState } from "react";
import { IconContext } from "react-icons";
import { Link } from "react-router-dom";
import { SidebarData } from "../data/SidebarData";
import "../styles/navigation.css";
import Label from "../HTMLComponents/Label";

export default function Navigation() {
  const [sidebar, setSidebar] = useState(false);

  const showSidebar = () => setSidebar(sidebar);

  return (
    <IconContext.Provider value={{ color: "#FFF" }}>
      <div className="navbar" />
      <nav className="nav-menu">
        <ul className="nav-menu-items" onClick={showSidebar}>
          <div className="nav-text logo-text">
            <Label text="FLIGHTBOARD" />
          </div>
          {SidebarData.map((item, index) => {
            return (
              <li key={index} className={item.cName}>
                <Link to={item.path}>
                  {item.icon}
                  <span>{item.title}</span>
                </Link>
              </li>
            );
          })}
        </ul>
      </nav>
    </IconContext.Provider>
  );
}
