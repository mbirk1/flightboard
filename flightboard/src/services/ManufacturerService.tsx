import axios, {AxiosResponse} from "axios";
import {Manufacturer} from "../models/manufacturer_model";

export async function getManufacturer(): Promise<Manufacturer[]> {
    const request: AxiosResponse<Manufacturer[]> = await axios.get('http://localhost:8080/manufacturer');
    return request.data;
}

export async function deleteManufacturer(id: string) {
    axios.delete('http://localhost:8080/manufacturer/' + id)
}