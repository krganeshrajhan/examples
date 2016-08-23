package example.design.pattern.creational.builder.item;

import example.design.pattern.creational.builder.packing.Packing;

/**
 * Created by 1532082 on 7/11/2016.
 */
public interface Item {

    public String name();
    public Packing packing();
    public float price();
}
