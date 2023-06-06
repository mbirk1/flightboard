import Button from "../HTMLComponents/Button";
import React from "react";
import {Link} from "react-router-dom";
import "../styles/main.css"

export default function Home() {
    return (
        <div className="home">
            <div>
                    <Link to={"/signIn"}>
                        <Button text="Sign in"/>
                    </Link>
                    <Link to={"/signUp"}>
                        <Button text="Sign up"/>
                    </Link>
            </div>
        </div>
    )
}