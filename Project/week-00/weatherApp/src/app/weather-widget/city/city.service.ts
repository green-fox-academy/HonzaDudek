import { Injectable } from '@angular/core';
import {City} from './City.model';
import {Observable, of} from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError, tap} from 'rxjs/operators';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})

export class CityService {

  private cityUrl = 'api.openweathermap.org/data/2.5/weather?q=';

  constructor( private http: HttpClient) {

  }

  private log(message: string) {
    console.log(`City Service: ${message}`);
  }

  getCity(name: string): Observable<City> {
    const url = `${this.cityUrl}/${name}`;
    return this.http.get<City>(url)
      .pipe(
        tap(_ => this.log(`Request sent to ${url}`)),
        catchError(this.handleError<any>('Send request to API')));
      }


  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.log(error);
      this.log(`${operation} fiiled: ${error.message} `);
      return of (result as T);
    };
  }
}
