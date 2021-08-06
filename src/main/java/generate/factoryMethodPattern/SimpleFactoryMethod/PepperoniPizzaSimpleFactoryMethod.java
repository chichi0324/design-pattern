package generate.factoryMethodPattern.SimpleFactoryMethod;

public class PepperoniPizzaSimpleFactoryMethod implements Pizza_SimpleFactoryMethod {

    public void addPepperoni(){
        System.out.println("add Pepperoni");
    }

    @Override
    public void prepare() {
        System.out.println("PepperoniPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza cut");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza box");
    }
}
