import "../styles/button.css";
import React from "react";
export default function Button(props: any) {
  const { style_type, text, customClick } = props;
  return (
    <button className={style_type} onClick={customClick}>
      {text}
    </button>
  );
}
