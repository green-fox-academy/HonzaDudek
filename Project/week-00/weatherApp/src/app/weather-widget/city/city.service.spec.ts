import { TestBed } from '@angular/core/testing';

import { CityService } from './city.service';
import {SearchComponent} from '../../search/search.component';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {CityComponent} from './city.component';

describe('CityService', () => {
  beforeEach(() => TestBed.configureTestingModule({      declarations: [
      CityComponent
    ],  imports: [
      BrowserModule,
      FormsModule,
      HttpClientModule,
    ],}));

  it('should be created', () => {
    const service: CityService = TestBed.get(CityService);
    expect(service).toBeTruthy();
  });
});
