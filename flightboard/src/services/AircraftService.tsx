import axios from 'axios';

export class AircraftService {

    static getAircrafts(){
        return axios.get('http://localhost:8080/aircraft');
    }
    static deleteAircraft(id:string) {
       axios.delete('http://localhost:8080/aircraft/' + id)
    }
}