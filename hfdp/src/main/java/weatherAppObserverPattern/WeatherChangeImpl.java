package weatherAppObserverPattern;

import java.util.ArrayList;

public class WeatherChangeImpl implements WeatherChange {

	private ArrayList<Observer> observer;
	private float temp;
	private float humidity;
	private float windSpeed;

	public WeatherChangeImpl() {
		this.observer = new ArrayList<Observer>();
	}

	public void registerForWeatherUpdate(Observer observer) {
		// TODO Auto-generated method stub
		this.observer.add(observer);
	}

	public void removeFromWeatherUpdate(Observer observer) {
		// TODO Auto-generated method stub
		this.observer.remove(observer);
	}

	public void notifyForWeatherUpdate() {
		// TODO Auto-generated method stub
		for (Observer observer : observer)
			observer.update(temp, humidity, windSpeed);
	}
	
	public void setWeatherChangeInfo(float temp,float humidity,float windSpeed){
		this.temp = temp;
		this.humidity = humidity;
		this.windSpeed = windSpeed;
		notifyForWeatherUpdate();
	}

}
