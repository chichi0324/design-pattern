package generate.factoryMethodPattern.FactoryMethod.NewYork;

import generate.factoryMethodPattern.FactoryMethod.Pizza;

public class NYStyleGreekPizza extends Pizza {

    public NYStyleGreekPizza(){
        name = "NY Style Greek Sauce Pizza.";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Grated Reggiano Cheese");
    }

}
