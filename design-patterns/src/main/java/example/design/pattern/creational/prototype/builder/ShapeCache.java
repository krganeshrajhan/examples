package example.design.pattern.creational.prototype.builder;

import example.design.pattern.creational.prototype.shape.Circle;
import example.design.pattern.creational.prototype.shape.Rectangle;
import example.design.pattern.creational.prototype.shape.Shape;
import example.design.pattern.creational.prototype.shape.Square;

import java.util.Hashtable;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
