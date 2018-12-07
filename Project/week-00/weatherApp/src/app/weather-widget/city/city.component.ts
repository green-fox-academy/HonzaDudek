import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-city',
  templateUrl: './city.component.html',
})


export class CityComponent implements OnInit {

  @Input() city;

  ngOnInit() {
  }

}
