import Manufacturer from './manufacturer';

class Aircraft {
  id: string;
  model: string;
  height: number;
  length: number;
  width: number;
  manufacturer: Manufacturer;

  constructor(
    id: string,
    model: string,
    height: number,
    length: number,
    width: number,
    manufacturer: Manufacturer
  ) {
    this.id = id;
    this.model = model;
    this.height = height;
    this.width = width;
    this.length = length;
    this.manufacturer = manufacturer;
  }
}

export default Aircraft;
