package example.design.pattern.creational.builder.example1.builder;

/**
 * Created by 1532082 on 3/14/2017.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough()   { pizza.setDough("cross"); }
    public void buildSauce()   { pizza.setSauce("mild"); }
    public void buildTopping() { pizza.setTopping("ham+pineapple"); }
}

