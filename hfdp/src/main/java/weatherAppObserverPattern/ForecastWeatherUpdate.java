package weatherAppObserverPattern;

public class ForecastWeatherUpdate implements Observer {

	private WeatherChange weatherChange;

	public ForecastWeatherUpdate(WeatherChange weatherChange) {
		this.weatherChange = weatherChange;
		this.weatherChange.registerForWeatherUpdate(this);
	}

	public void update(float temp, float humidity, float windSpeed) {
		// TODO Auto-generated method stub
		System.out.println(
				"temp On ForecastScreen\t" + temp + "\nHumidity\t" + humidity + "\nWind Speed\t" + windSpeed + "\n");
	}

}
