import React, { useEffect, useState } from 'react';
import { AircraftApi } from '../api/aircraft_api';
export default function Hangar(): React.ReactElement {
  const [hangar, setHangar] = useState([]);
  const [, setLoading] = useState(false);
  useEffect(() => {
    setLoading(true);
    void AircraftApi.fetchHangar()
      .then((r: any) => {
        console.log(r);
        setHangar(r);
      })
      .catch((e) => {
        console.error(e);
      })
      .finally(() => {
        setLoading(false);
      });
  }, []);
  return (
    <ul>
      {hangar.map((aircraft) => (
        <li key={aircraft}>{aircraft}</li>
      ))}
    </ul>
  );
}
