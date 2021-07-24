package structure.decoratorPattern;

// 牛奶裝飾者基本上寫法跟摩卡裝飾者一樣
public class Milk extends CondimentDecorator {

    Beverage mBeverage;

    public Milk(Beverage beverage) {
        this.mBeverage = beverage;
    }

    public String getDescription() {
        return mBeverage.getDescription() + ", Milk";
    }

    public int cost() {
        return 15 + mBeverage.cost();
    }
}
