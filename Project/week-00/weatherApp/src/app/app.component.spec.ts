import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { WeatherWidgetComponent } from './weather-widget/weather-widget.component';
import { CityComponent } from './weather-widget/city/city.component';
import {SearchComponent} from './search/search.component';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {LocationStrategy, PathLocationStrategy} from '@angular/common';
import {Component, Injectable} from '@angular/core';

@Component({selector: 'app-search', template: ''})
class SearchStubComponent {}

@Component({selector: 'app-city', template: ''})
class CityStubComponent {}

@Component({selector: 'app-weather-widget', template: ''})
class WeatherWidgetStubComponent {}


describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
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
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'weatherApp'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('weatherApp');
  });

  it('should render title in a h1 tag', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to weatherApp!');
  });
});
