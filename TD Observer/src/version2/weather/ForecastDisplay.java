package version2.weather;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Displayer {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	
	private WeatherData dataSource;

	public ForecastDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
		dataSource = weatherData;
	}

	public void update(Observable observable, Object arg1) {
        lastPressure = currentPressure;
		currentPressure = dataSource.getPressure();
		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
