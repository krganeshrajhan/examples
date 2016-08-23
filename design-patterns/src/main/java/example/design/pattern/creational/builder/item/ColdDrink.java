package example.design.pattern.creational.builder.item;

import example.design.pattern.creational.builder.packing.Bottle;
import example.design.pattern.creational.builder.packing.Packing;

/**
 * Created by 1532082 on 7/11/2016.
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
