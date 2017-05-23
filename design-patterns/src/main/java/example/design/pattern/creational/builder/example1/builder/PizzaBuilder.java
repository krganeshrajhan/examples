package example.design.pattern.creational.builder.example1.builder;

import example.design.pattern.creational.builder.example1.pizza.Pizza;

/**
 * Created by 1532082 on 3/13/2017.
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() { return pizza; }
    public void createNewPizzaProduct() { pizza = new Pizza(); }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
