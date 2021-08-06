package generate.factoryMethodPattern.FactoryMethod;

import generate.factoryMethodPattern.FactoryMethod.Chicago.ChicagoPizzaStore;
import generate.factoryMethodPattern.FactoryMethod.NewYork.NYPizzaStore;
import generate.factoryMethodPattern.SimpleFactoryMethod.PizzaStore;
import generate.factoryMethodPattern.SimpleFactoryMethod.Pizza_SimpleFactoryMethod;

public class PizzaTestDrive {

    public static void main(String[] args){

        PizzaStoreAbstract nyStore = new NYPizzaStore();
        PizzaStoreAbstract chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A order a " + pizza.getName());

        System.out.println("=================================");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("B order a " + pizza.getName());

    }
}
