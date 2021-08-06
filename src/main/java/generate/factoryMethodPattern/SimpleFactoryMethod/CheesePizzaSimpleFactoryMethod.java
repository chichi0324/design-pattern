package generate.factoryMethodPattern.SimpleFactoryMethod;

public class CheesePizzaSimpleFactoryMethod implements Pizza_SimpleFactoryMethod {

    public void addCheese(){
        System.out.println("Pizza add Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza box");
    }
}
