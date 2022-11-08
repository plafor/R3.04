package version2.weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Displayer {
	private float temperature;
	private float humidity;
	
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable observable, Object arg1) {
		WeatherData data = (WeatherData) observable;
		this.temperature = data.getTemperature();
		this.humidity = data.getHumidity();
		display();
	}
}
