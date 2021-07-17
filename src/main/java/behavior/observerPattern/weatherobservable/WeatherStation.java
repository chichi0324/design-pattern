package behavior.observerPattern.weatherobservable;

import behavior.observerPattern.weatherobservable.display.CurrentConditionsDisplay;
import behavior.observerPattern.weatherobservable.display.ForecastDisplay;
import behavior.observerPattern.weatherobservable.display.HeatIndexDisplay;
import behavior.observerPattern.weatherobservable.display.StatisticsDisplay;

public class WeatherStation {
  
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
    
    weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
  }
}