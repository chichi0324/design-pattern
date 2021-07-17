package behavior.strategyPattern;

import behavior.strategyPattern.duck.Duck;
import behavior.strategyPattern.duck.MallardDuck;
import behavior.strategyPattern.duck.ModelDuck;
import behavior.strategyPattern.fly.FlyRocketPowered;

public class DuckExample {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack(); // Quack
    mallard.performFly(); // I'm flying!!
    
    Duck model = new ModelDuck();
    model.performFly(); // I can't fly
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly(); // I'm flying with a rocket
  }
}