package version1.weather;

public class CurrentConditionsDisplay implements Observer, Displayer {
	private float temperature;
	private float humidity;
	//TODO:
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
