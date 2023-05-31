import {useEffect, useState} from "react";

export default function AircraftTable(){

    const [data, setData] = useState(null);

    useEffect(() => {
        fetch('https://localhost:8080/aircraft')
            .then(response => response.json())
            .then(json => setData(json))
            .catch(error => console.error(error));
    }, []);

    return (
        <div>
            {data ? <pre>{JSON.stringify(data, null, 2)}</pre> : 'Loading...'}
        </div>
    );
}
