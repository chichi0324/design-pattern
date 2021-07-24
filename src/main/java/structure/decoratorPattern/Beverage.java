package structure.decoratorPattern;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    // 留給子類別實作
    public abstract int cost();
}

