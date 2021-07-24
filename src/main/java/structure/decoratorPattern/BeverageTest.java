package structure.decoratorPattern;

public class BeverageTest {

    public static void main(String[] args) {
        // 點了一杯 Espresso, 印出它的資訊
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() +
                " $" + beverage.cost());

        // 再點一杯 Espresso
        Beverage beverage2 = new Espresso();

        // 用摩卡裝飾 Espresso
        beverage2 = new Mocha(beverage2);

        // 用牛奶裝飾加了摩卡的 Espresso
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() +
                " $" + beverage2.cost());
    }
}
