package behavior.observerPattern.weather.subject;

import behavior.observerPattern.weather.observerDisplay.Observer;

public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}