package generate.factoryMethodPattern.FactoryMethod.NewYork;

import generate.factoryMethodPattern.FactoryMethod.Pizza;
import generate.factoryMethodPattern.FactoryMethod.PizzaStoreAbstract;
import generate.factoryMethodPattern.SimpleFactoryMethod.Pizza_SimpleFactoryMethod;

public class NYPizzaStore extends PizzaStoreAbstract {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new NYStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }

}
