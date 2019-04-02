package weatherAppObserverPattern;

public class ParkDisplayForWeatherUpdate implements Observer {

	private WeatherChange weatherChange;

	public ParkDisplayForWeatherUpdate(WeatherChange weatherChange) {
		this.weatherChange = weatherChange;
		this.weatherChange.registerForWeatherUpdate(this);
	}

	public void update(float temp, float humidity, float windSpeed) {
		// TODO Auto-generated method stub
		System.out.println(
				"temp On Park Display\t" + temp + "\nHumidity\t" + humidity + "\nWind Speed\t" + windSpeed + "\n");
	}

}
