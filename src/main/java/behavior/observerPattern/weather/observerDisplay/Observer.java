package behavior.observerPattern.weather.observerDisplay;

public interface Observer {
  public void update(float temp, float humidity, float pressure);
}