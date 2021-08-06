package generate.factoryMethodPattern.FactoryMethod;

import generate.factoryMethodPattern.SimpleFactoryMethod.Pizza_SimpleFactoryMethod;

/*
* 工廠方法 : 定義一個創建對象的接口，由子類"決定"要實例化哪個類，工廠
* 方法讓實例化推遲到子類。所謂的"決定"並非是運行時做決定，而是只在編寫
* 創建者類(creator，此範例的PizzaStoreAbstract)時，不需要知道實際
*創造的產品是哪個。選擇使用哪個子類，自然就決定好要創建的產品是什麼。
*
* 披薩加盟店的概念，若要在世界各地創造不同口味的披薩
* 但又希望披薩的製作流程不一致，想要有相同的品質，就
* 將原本的PizzaStore改為抽象類別，這樣所有的子類(
* 加盟店)就可以有自己的客製的createPizza方法，同時
* 也可將orderPizza加上final預防子類覆蓋修改流程
*
*
* */
public abstract class PizzaStoreAbstract {

    //希望加盟店處理訂單的流程是一致的
    public Pizza orderPizza(String type){

        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /*工廠方法是抽象的，因此將實例化披薩的工作交給子類，利用參數來指定所需的產品
    * 此例中是因為各區域有不同的披薩口味，因此讓各個分店(子類)有不一樣的披薩製作
    * 方法(createPizza)
    * */
    public abstract Pizza createPizza(String type);
}
