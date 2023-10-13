import React from 'react';

export default function PrimaryButton(props:{text: string}): React.ReactElement {
  return (
    <button className="inline-flex overflow-hidden text-white bg-gray-800 rounded group">
      <span className="pl-4 pr-5 py-2.5">{props.text}</span>
    </button>
  );
}
