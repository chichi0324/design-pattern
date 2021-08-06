package generate.factoryMethodPattern.SimpleFactoryMethod;

public class GreekPizzaSimpleFactoryMethod implements Pizza_SimpleFactoryMethod {

    public void addSeeFood(){
        System.out.println("Greek seefood pizza");
    }

    @Override
    public void prepare() {
        System.out.println("GreekPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("GreekPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("GreekPizza cut");
    }

    @Override
    public void box() {
        System.out.println("GreekPizza box");
    }
}
