package weatherAppObserverPattern;

public class MainClass {
	
	public static void main(String[] args){
		WeatherChangeImpl weatherChange = new WeatherChangeImpl();
	//	ForecastWeatherUpdate forecastDisplay = new ForecastWeatherUpdate(weatherChange);
	//	ParkDisplayForWeatherUpdate parkDisplay = new ParkDisplayForWeatherUpdate(weatherChange);
	//	weatherChange.removeFromWeatherUpdate(parkDisplay);
	//	weatherChange.removeFromWeatherUpdate(forecastDisplay);
		weatherChange.setWeatherChangeInfo((float) 32.12, 23, 5);
	}
}
