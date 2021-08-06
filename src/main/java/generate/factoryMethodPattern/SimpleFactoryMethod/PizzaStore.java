package generate.factoryMethodPattern.SimpleFactoryMethod;
/*
* 簡單工廠方法
* 其實不是一種設計模式，而是一種編寫程式的習慣
*
* */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    Pizza_SimpleFactoryMethod orderPizza(String type){

        Pizza_SimpleFactoryMethod pizzaSimpleFactoryMethod;



      /*當一種主商品會有許多種子分類時，容易出現需要多種判斷式，依照不同條件(口味)來決定要實體化哪個類(製作哪個披薩)
         往後擴展業務時，可能只是新增不同商業邏輯(例如新增外送業務、線上平台購買)，基於該商品有多種種類的原因，會出現
         重複判斷的情況，為避免重複程式碼的產生，以及日後維護的便利，因此將此處程式碼移出，新增一個物件為"工廠"  */
//        if(type.equals("cheese")){
//            pizza = new CheesePizza();
//        假設刪除該口味，若有重複程式碼的部分，就都要人工查詢並重複刪除
//        } else if(type.equals("greek")){
//            pizza = new GreekPizza();
//        } else if(type.equals("pepperoni")){
//            pizza = new PepperoniPizza();
//        } else if(type.equals("clam")){
//            pizza = new ClamPizza();
//        } else if(type.equals("veggie")){
//            pizza = new VeggiePizza();
//        }

        pizzaSimpleFactoryMethod = factory.createPizza(type);
        pizzaSimpleFactoryMethod.prepare();
        pizzaSimpleFactoryMethod.bake();
        pizzaSimpleFactoryMethod.cut();
        pizzaSimpleFactoryMethod.box();
        return pizzaSimpleFactoryMethod;

    }


}
