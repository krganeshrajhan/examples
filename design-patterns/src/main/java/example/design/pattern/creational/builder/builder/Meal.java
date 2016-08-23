package example.design.pattern.creational.builder.builder;

import example.design.pattern.creational.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}