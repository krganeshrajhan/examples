package example.design.pattern.creational.builder.builder;

import example.design.pattern.creational.builder.item.ChickenBurger;
import example.design.pattern.creational.builder.item.Coke;
import example.design.pattern.creational.builder.item.Pepsi;
import example.design.pattern.creational.builder.item.VegBurger;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}