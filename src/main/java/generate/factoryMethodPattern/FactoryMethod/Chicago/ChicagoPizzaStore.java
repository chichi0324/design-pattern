package generate.factoryMethodPattern.FactoryMethod.Chicago;

import generate.factoryMethodPattern.FactoryMethod.Pizza;
import generate.factoryMethodPattern.FactoryMethod.PizzaStoreAbstract;
import generate.factoryMethodPattern.SimpleFactoryMethod.Pizza_SimpleFactoryMethod;

public class ChicagoPizzaStore extends PizzaStoreAbstract {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new ChicagoStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }

}
