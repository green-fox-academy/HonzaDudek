export class City {
  name: string;
  country: string;
  temperature: number;
  weatherImage: string;

  constructor(name: string, country: string, temperature: number, weatherImage: string) {
    this.name = name;
    this.country = country;
    this.temperature = temperature;
    this.checkWeatherIcon(weatherImage);
  }

  checkWeatherIcon(weatherImage: string) {
    if (weatherImage === 'Clouds') {
      this.weatherImage = 'assets/images/cloudy.png';
    } else if (weatherImage === 'Clear') {
      this.weatherImage = 'assets/images/sunny.png';
    } else if (weatherImage === 'Rain') {
      this.weatherImage = 'assets/images/rainy.png';
    } else if (weatherImage === 'Snow') {
      this.weatherImage = 'assets/images/snowy.png';
    } else if (weatherImage === 'Fog') {
      this.weatherImage = 'assets/images/foggy.png';
    } else {
      this.weatherImage = 'assets/images/partly-cloudy.png';
    }
  }
}
