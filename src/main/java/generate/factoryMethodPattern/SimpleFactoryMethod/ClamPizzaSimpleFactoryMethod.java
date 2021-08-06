package generate.factoryMethodPattern.SimpleFactoryMethod;

public class ClamPizzaSimpleFactoryMethod implements Pizza_SimpleFactoryMethod {

    public void addClam(){
        System.out.println("add clam");
    }

    @Override
    public void prepare() {
        System.out.println("ClamPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza box");
    }

}
