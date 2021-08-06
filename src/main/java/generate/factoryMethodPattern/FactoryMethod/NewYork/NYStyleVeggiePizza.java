package generate.factoryMethodPattern.FactoryMethod.NewYork;

import generate.factoryMethodPattern.FactoryMethod.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza(){
        name = "NY Style Cheese an Sauce Pizza.";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Grated Reggiano Cheese");
    }

}
