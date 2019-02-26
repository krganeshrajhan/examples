package example.java.design.patterns.principles.structural.decorator.beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    public double getCost() {
        return .2 + beverage.getCost();
    }

    public String getDescription() {
        return beverage.getDescription() + " with Milk";
    }
}
