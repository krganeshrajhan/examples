package example.design.pattern.structural.flyweight.builder;

import example.design.pattern.structural.flyweight.shape.Circle;
import example.design.pattern.structural.flyweight.shape.Shape;

import java.util.HashMap;

/**
 * Created by 1532082 on 9/15/2016.
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null ){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;

    }
}
