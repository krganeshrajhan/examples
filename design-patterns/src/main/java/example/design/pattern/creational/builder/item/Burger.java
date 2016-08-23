package example.design.pattern.creational.builder.item;

import example.design.pattern.creational.builder.packing.Packing;
import example.design.pattern.creational.builder.packing.Wrapper;

/**
 * Created by 1532082 on 7/11/2016.
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
