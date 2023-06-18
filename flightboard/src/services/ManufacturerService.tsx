import axios from "axios";

export class ManufacturerService {

    static getManufacturer(){
        return axios.get('http://localhost:8080/manufacturer');
    }
    static deleteManufacturer(id:string) {
        axios.delete('http://localhost:8080/manufacturer/' + id)
    }
}