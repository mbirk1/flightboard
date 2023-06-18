import React from "react";

export default function Select(props: any) {
    const {value} = props;

    return (
        <select>
            {
               value.map(
                    function (manu: any) {
                        return (
                            <option>
                                {manu.id}
                            </option>);
                    }
                )
            }
        </select>
    )
}