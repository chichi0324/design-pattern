package generate.factoryMethodPattern.FactoryMethod.NewYork;

import generate.factoryMethodPattern.FactoryMethod.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza(){
        name = "NY Style Pepperoni an Sauce Pizza.";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Grated Reggiano Cheese");
    }

}
