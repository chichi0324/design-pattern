package behavior.observerPattern.weather;

import behavior.observerPattern.weather.observerDisplay.CurrentConditionsDisplay;
import behavior.observerPattern.weather.observerDisplay.ForecastDisplay;
import behavior.observerPattern.weather.observerDisplay.HeatIndexDisplay;
import behavior.observerPattern.weather.observerDisplay.StatisticsDisplay;
import behavior.observerPattern.weather.subject.WeatherData;

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