package example.design.pattern.creational.builder.example1;

import example.design.pattern.creational.builder.example1.builder.HawaiianPizzaBuilder;
import example.design.pattern.creational.builder.example1.builder.PizzaBuilder;
import example.design.pattern.creational.builder.example1.builder.SpicyPizzaBuilder;
import example.design.pattern.creational.builder.example1.pizza.Pizza;
import example.design.pattern.creational.builder.example1.waiter.Waiter;

/**
 * Created by 1532082 on 3/13/2017.
 */
public class BuilderPatternDemo1 {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
