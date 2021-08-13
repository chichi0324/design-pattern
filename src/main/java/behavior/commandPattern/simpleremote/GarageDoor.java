package behavior.commandPattern.simpleremote;

public class GarageDoor {
  
  public GarageDoor() {}
  
  public void up() {
    System.out.println("Garage Door is Open");
  }
  
  public void down() {
    System.out.println("Garage Door is Closed");
  }
  
  public void stop() {
    System.out.println("Garage door is Stopped");
  }
  
  public void lightOn() {
    System.out.println("Garage light is On");
  }
  
  public void lightOff() {
    System.out.println("Garage light is Off");
  }
}