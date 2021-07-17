package behavior.strategyPattern.quack;

public class Squeak implements QuackBehavior {
  public void quack() {
    System.out.println("Squeak");
  }
}