package generate.factoryMethodPattern.FactoryMethod.NewYork;

import generate.factoryMethodPattern.FactoryMethod.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza(){
        name = "NY Style Clam an Sauce Pizza.";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Grated Reggiano Cheese");
    }

}
