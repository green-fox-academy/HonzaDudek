import { TestBed } from '@angular/core/testing';

import { SearchService } from './search.service';
import {SearchComponent} from './search.component';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

describe('SearchService', () => {
  beforeEach(() => TestBed.configureTestingModule({      declarations: [
      SearchComponent
    ],  imports: [
      BrowserModule,
      FormsModule,
      HttpClientModule,
    ],}));

  it('should be created', () => {
    const service: SearchService = TestBed.get(SearchService);
    expect(service).toBeTruthy();
  });
});
