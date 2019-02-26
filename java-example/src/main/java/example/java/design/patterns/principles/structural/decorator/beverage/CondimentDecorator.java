package example.java.design.patterns.principles.structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract double getCost();

    public abstract String getDescription();
}
