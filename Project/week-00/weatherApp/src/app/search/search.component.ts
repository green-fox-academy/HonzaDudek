import { Component, ElementRef, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';
import { SearchService } from './search.service';
import { City } from '../weather-widget/city/City.model';
import { Countries } from './countries.model';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})



export class SearchComponent implements OnInit {

  city: City;
  @Output() sendCity = new EventEmitter<City>();

  countries = new Countries();

  @ViewChild('searchedCity') searchedCity: ElementRef;

  constructor(private search: SearchService) {

  }

  ngOnInit() {
  }

  getCity(): void {
    this.search.getCity(this.searchedCity.nativeElement.value)
      .subscribe(response => this.sendCity.emit(new City(response.name, response.sys.country, response.main.temp , response.weather[0].main)));
  }



}
