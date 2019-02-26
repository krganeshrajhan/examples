package example.java.design.patterns.principles.structural.decorator.beverage;

public class Sugar extends CondimentDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    public double getCost() {
        return 0.1 + beverage.getCost();
    }

    public String getDescription() {
        return beverage.getDescription() + " with Sugar";
    }
}
