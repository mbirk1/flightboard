import React, { useEffect, useState } from 'react';
import { fetchHangar } from '../api/aircraft_api';
import type Aircraft from '../models/aircraft';
export default function Hangar(): React.ReactElement {
  const [hangar, setHangar] = useState<Aircraft[]>([]);

  useEffect(() => {
    void fetchHangar().then((responseData) => {
      setHangar(responseData);
    });
  });

  return (
    <div className="relative overflow-x-auto grid flex-row justify-items-end">
      <div className="m-3 justify-self-end">
        <a href="#_" className="inline-flex overflow-hidden text-white bg-gray-800 rounded group">
          <span className="pl-4 pr-5 py-2.5">Flugzeug kaufen</span>
        </a></div>
      <table className="w-full text-sm text-left text-gray-500 dark:text-gray-400">
        <thead className="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
          <th scope="col" className="px-6 py-3">Model</th>
          <th scope="col" className="px-6 py-3">Höhe</th>
          <th scope="col" className="px-6 py-3">Länge</th>
          <th scope="col" className="px-6 py-3">Breite</th>
        </thead>
        <tbody>
          {hangar.map((item, key) => {
            return (
              <tr key={item.id} className="bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                <td className="px-6 py-4">{item.model}</td>
                <td className="px-6 py-4">{item.height}</td>
                <td className="px-6 py-4">{item.length}</td>
                <td className="px-6 py-4">{item.width}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}
