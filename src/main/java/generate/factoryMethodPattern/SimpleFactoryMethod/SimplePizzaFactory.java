package generate.factoryMethodPattern.SimpleFactoryMethod;

/*
* 簡單工廠
* 將需要頻繁判斷的內容統一到龍一個類中，減少程式碼的重複
* 缺點為容易產生多個工廠，像在此披薩範例中，要拓展分店時
* 簡單工廠的方式就是新增加NYPizzaFactory、ChicagoPiz
* -zaFactory等，這樣就會產生工廠越來越多的問題
*
* */
public class SimplePizzaFactory {

    public Pizza_SimpleFactoryMethod createPizza(String type){

        Pizza_SimpleFactoryMethod pizzaSimpleFactoryMethod = null;

        if(type.equals("cheese")){
            pizzaSimpleFactoryMethod = new CheesePizzaSimpleFactoryMethod();
        } else if(type.equals("greek")){
            pizzaSimpleFactoryMethod = new GreekPizzaSimpleFactoryMethod();
        } else if(type.equals("pepperoni")){
            pizzaSimpleFactoryMethod = new PepperoniPizzaSimpleFactoryMethod();
        } else if(type.equals("clam")){
            pizzaSimpleFactoryMethod = new ClamPizzaSimpleFactoryMethod();
        } else if(type.equals("veggie")){
            pizzaSimpleFactoryMethod = new VeggiePizzaSimpleFactoryMethod();
        }
        return pizzaSimpleFactoryMethod;
    }
}
