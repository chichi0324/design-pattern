package behavior.strategyPattern.duck;

import behavior.strategyPattern.fly.FlyWithWings;
import behavior.strategyPattern.quack.Quack;

/**
 *
 */
public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }
  
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}