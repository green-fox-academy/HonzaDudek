import { TestBed } from '@angular/core/testing';

import { ConfigService } from './config.service';
import {AppComponent} from './app.component';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {Component, Injectable} from '@angular/core';

@Component({selector: 'app-search', template: ''})
class SearchStubComponent {}

@Component({selector: 'app-city', template: ''})
class CityStubComponent {}

@Component({selector: 'app-weather-widget', template: ''})
class WeatherWidgetStubComponent {}

describe('ConfigService', () => {
  beforeEach(() => TestBed.configureTestingModule({
    declarations: [
      AppComponent,
      WeatherWidgetStubComponent,
      CityStubComponent,
      SearchStubComponent
    ],  imports: [
      BrowserModule,
      FormsModule,
      HttpClientModule,
    ],
  }));

  it('should be created', () => {
    const service: ConfigService = TestBed.get(ConfigService);
    expect(service).toBeTruthy();
  });
});
