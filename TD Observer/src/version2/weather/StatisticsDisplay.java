package version2.weather;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, Displayer {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	//TODO:

	public StatisticsDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		float temp = ((Float) arg).floatValue();
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}
		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
