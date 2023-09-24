import React from "react";
import * as AiIcons from "react-icons/ai";
import * as FaIcons from "react-icons/fa";
import * as BsIcons from "react-icons/bs";

export const SidebarData = [
  {
    title: "Home",
    path: "/home",
    icon: <AiIcons.AiFillHome />,
    cName: "nav-text",
  },
  {
    title: "Flüge",
    path: "/flights",
    icon: <FaIcons.FaPlane />,
    cName: "nav-text",
  },
  {
    title: "Flugzeuge",
    path: "/aircrafts",
    icon: <BsIcons.BsFillAirplaneFill />,
    cName: "nav-text",
  },
];
