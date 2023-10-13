import React, { useEffect, useState } from 'react';
import { fetchHangar } from '../api/AircraftApi';
import type Aircraft from '../models/aircraft';
import PrimaryButton from '../components/primary-button';
export default function Hangar(): React.ReactElement {
  const [hangar, setHangar] = useState<Aircraft[]>([]);

  useEffect(() => {
    void fetchHangar().then((responseData) => {
      setHangar(responseData);
    });
  }, []);

  return (
    <div className="relative overflow-x-auto grid flex-row justify-items-end ml-8 mr-8">
      <div className="m-3 justify-self-end">
        <PrimaryButton text={'Flugzeug kaufen'}></PrimaryButton>
      </div>
      <table className="w-full text-sm text-left text-gray-500 dark:text-gray-400">
        <thead className="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
          <tr>
            <th scope="col" className="px-6 py-3">Model</th>
            <th scope="col" className="px-6 py-3">Höhe</th>
            <th scope="col" className="px-6 py-3">Länge</th>
            <th scope="col" className="px-6 py-3">Breite</th>
          </tr>
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
