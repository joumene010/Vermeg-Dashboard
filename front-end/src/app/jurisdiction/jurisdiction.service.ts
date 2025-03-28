import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Jurisdiction {
  prefix: string;
  description: string;
}

@Injectable({
  providedIn: 'root'
})
export class JurisdictionService {
  private apiUrl = '/api/jurisdictions';

  constructor(private http: HttpClient) { }

  getAll(): Observable<Jurisdiction[]> {
    return this.http.get<Jurisdiction[]>(this.apiUrl);
  }

  // Add other CRUD methods as needed
}