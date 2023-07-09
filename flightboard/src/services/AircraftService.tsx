import axios, {AxiosResponse} from 'axios';
import {Aircraft} from "../models/aircraft_model";

    export async function getAircrafts(): Promise<Aircraft[]> {
        const request: AxiosResponse<Aircraft[]> = await axios.get('http://localhost:8080/aircraft');
        return request.data;
    }
    export async function deleteAircraft(id:string) {
        const request: AxiosResponse<Aircraft[]> = await axios.delete('http://localhost:8080/aircraft/' + id);
        return request.data;
    }

    export async function createAircraft(){

    }