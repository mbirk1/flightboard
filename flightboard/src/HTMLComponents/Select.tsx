import React from "react";

export default function Select(props: any) {
  const { value, style_type } = props;
  return (
    <select className={style_type}>
      {value.map(function (manu: any) {
        return <option key={manu.id}>{manu.name}</option>;
      })}
    </select>
  );
}
