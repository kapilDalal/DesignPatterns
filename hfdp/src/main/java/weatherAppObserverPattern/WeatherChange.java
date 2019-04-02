package weatherAppObserverPattern;

public interface WeatherChange {
	public void registerForWeatherUpdate(Observer observer);

	public void removeFromWeatherUpdate(Observer observer);

	public void notifyForWeatherUpdate();
}
