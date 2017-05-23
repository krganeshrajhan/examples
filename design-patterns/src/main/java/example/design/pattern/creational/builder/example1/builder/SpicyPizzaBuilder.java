package example.design.pattern.creational.builder.example1.builder;

/**
 * Created by 1532082 on 3/14/2017.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough()   { pizza.setDough("pan baked"); }
    public void buildSauce()   { pizza.setSauce("hot"); }
    public void buildTopping() { pizza.setTopping("pepperoni+salami"); }
}
