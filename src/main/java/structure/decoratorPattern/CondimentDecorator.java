package structure.decoratorPattern;

public abstract class CondimentDecorator extends Beverage {

    // 因為希望配料也能顯示出來,
    // 因此所有子類別都要實作這個 method
    public abstract String getDescription();
}
