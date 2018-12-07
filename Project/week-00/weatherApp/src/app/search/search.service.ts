import { Injectable } from '@angular/core';
import { City} from '../weather-widget/city/City.model';
import { Observable, of} from 'rxjs';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { catchError, map, tap} from 'rxjs/operators';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})

export class SearchService {

  private cityUrl = 'http://api.openweathermap.org/data/2.5/weather?q=';
  constructor( private http: HttpClient) {
  }

  private log(message: string) {
    console.log(`City Service: ${message}`);
  }

  getCity(name: string): Observable<any> {
    const url = `${this.cityUrl}${name}&units=metric&appid=472a5a818608f56016038c3c26b59727`;
    return this.http.get<any>(url)
      .pipe(
        tap(_ => this.log(`Request sent to ${url}`)),
        catchError(this.handleError<any>('Send request to API')));
  }



  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.log(error);
      this.log(`${operation} filled: ${error.message} `);
      return of (result as T);
    };
  }
}
