package generate.factoryMethodPattern;

import generate.factoryMethodPattern.FactoryMethod.Chicago.ChicagoStyleCheesePizza;
import generate.factoryMethodPattern.FactoryMethod.Chicago.ChicagoStyleClamPizza;
import generate.factoryMethodPattern.FactoryMethod.Chicago.ChicagoStylePepperoniPizza;
import generate.factoryMethodPattern.FactoryMethod.NewYork.NYStyleCheesePizza;
import generate.factoryMethodPattern.FactoryMethod.NewYork.NYStyleClamPizza;
import generate.factoryMethodPattern.FactoryMethod.NewYork.NYStylePepperoniPizza;
import generate.factoryMethodPattern.FactoryMethod.NewYork.NYStyleVeggiePizza;
import generate.factoryMethodPattern.FactoryMethod.Pizza;

public class DependentPizzaStore {

    public Pizza createPizza(String style, String type){
        Pizza pizza = null;
        if(style.equals("NY")){
            if (type.equals("cheese")){
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("veggie")){
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("clam")){
                pizza = new NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")){
            if (type.equals("cheese")){
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")){
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("clam")){
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error : Invalid pizza type");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
