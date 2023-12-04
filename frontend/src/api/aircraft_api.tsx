import axios from 'axios';
import type Aircraft from '../models/aircraft';

const baseUrl = 'http://localhost:8080';

async function fetchHangar(): Promise<Aircraft[]> {
  const response = await axios.get(baseUrl + '/aircraft');
  return response.data;
}

export const AircraftApi = {
  fetchHangar
};
