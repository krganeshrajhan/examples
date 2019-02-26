package example.java.design.patterns.principles.structural.decorator.beverage;

public class HouseBlend extends Beverage {

    public double getCost() {
        return 0.5d;
    }

    public String getDescription() {
        return "HouseBlend";
    }
}
