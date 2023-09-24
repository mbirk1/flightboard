import "../styles/label.css";
import React from "react";
export default function Label(props: any) {
  const { text, style_type } = props;
  return <label className={style_type}>{text}</label>;
}
