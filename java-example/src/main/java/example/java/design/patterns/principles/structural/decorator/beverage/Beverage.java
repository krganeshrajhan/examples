package example.java.design.patterns.principles.structural.decorator.beverage;

public abstract class Beverage {

    public abstract double getCost();

    public abstract String getDescription();

    public String toString() {
        return getDescription() + " at " + getCost();
    }

}
