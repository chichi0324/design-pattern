package generate.factoryMethodPattern.FactoryMethod.Chicago;

import generate.factoryMethodPattern.FactoryMethod.Pizza;

public class ChicagoStyleGreekPizza extends Pizza {
    public ChicagoStyleGreekPizza(){
        name = "Chicago Style Greek Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        topping.add("Shredded Mozzarella Cheese");
    }

    public void cut(){
        System.out.println("Cutting the pizza into square slice.");
    }
}
