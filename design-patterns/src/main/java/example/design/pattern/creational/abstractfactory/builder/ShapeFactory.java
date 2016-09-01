package example.design.pattern.creational.abstractfactory.builder;

import example.design.pattern.creational.abstractfactory.color.Color;
import example.design.pattern.creational.abstractfactory.shape.Circle;
import example.design.pattern.creational.abstractfactory.shape.Rectangle;
import example.design.pattern.creational.abstractfactory.shape.Shape;
import example.design.pattern.creational.abstractfactory.shape.Square;

/**
 * Created by 1532082 on 9/1/2016.
 */
public class ShapeFactory implements AbstractFactory {
    public Color getColor(String Color) {
        return null;
    }

    public Shape getShape(String shape) {
        if(shape.equals("RECTANGLE")) {
            return new Rectangle();
        } else if(shape.equals("CIRCLE")) {
            return new Circle();
        } else if(shape.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
