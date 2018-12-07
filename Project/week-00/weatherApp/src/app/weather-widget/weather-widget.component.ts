import { Component, Input, OnInit } from '@angular/core';
import { City} from './city/City.model';
import { HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-weather-widget',
  templateUrl: './weather-widget.component.html',
})
export class WeatherWidgetComponent implements OnInit {

  @Input() city: City;

  cities: City[] = [];

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  getCountry(city: City): void {
     this.http.get('./assets/countries.json')
      .subscribe(
        function(data: string) {
          city.country = data[city.country];
        });
  }

  addCity(city: City) {
    this.getCountry(city);
    this.cities.push(city);
  }

}
