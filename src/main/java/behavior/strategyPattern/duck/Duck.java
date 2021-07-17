package behavior.strategyPattern.duck;

import behavior.strategyPattern.fly.FlyBehavior;
import behavior.strategyPattern.quack.QuackBehavior;

/**
 *
 */
public abstract class Duck {

  /**
   *  將變動的部分封裝起來
   */
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck() {
  }
  
  public abstract void display();
  
  public void performFly() {
    flyBehavior.fly();
  }
  
  public void performQuack() {
    quackBehavior.quack();
  }
  
  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }
  
  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }
  
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }  
}