class Aircraft {
  id: string;
  model: string;
  height: number;
  length: number;
  width: number;

  constructor(id: string, model: string, height: number, length: number, width: number) {
    this.id = id;
    this.model = model;
    this.height = height;
    this.width = width;
    this.length = length;
  }
}

export default Aircraft;
