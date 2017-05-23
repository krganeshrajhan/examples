package example.design.pattern.creational.builder.example1.waiter;

import example.design.pattern.creational.builder.example1.builder.PizzaBuilder;
import example.design.pattern.creational.builder.example1.pizza.Pizza;

/**
 * Created by 1532082 on 3/14/2017.
 */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }
    public Pizza getPizza() { return pizzaBuilder.getPizza(); }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
