package behavior.strategyPattern.quack;

public class Quack implements QuackBehavior {
  public void quack() {
    System.out.println("Quack");
  }
}