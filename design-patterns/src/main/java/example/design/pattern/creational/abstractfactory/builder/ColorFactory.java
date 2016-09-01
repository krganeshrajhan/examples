package example.design.pattern.creational.abstractfactory.builder;

import example.design.pattern.creational.abstractfactory.color.Blue;
import example.design.pattern.creational.abstractfactory.color.Color;
import example.design.pattern.creational.abstractfactory.color.Green;
import example.design.pattern.creational.abstractfactory.color.Red;
import example.design.pattern.creational.abstractfactory.shape.Shape;

/**
 * Created by 1532082 on 9/1/2016.
 */
public class ColorFactory implements AbstractFactory {
    public Color getColor(String color) {
        if(color.equals("RED")) {
            return new Red();
        } else if(color.equals("BLUE")) {
            return new Blue();
        } else if(color.equals("GREEN")) {
            return new Green();
        }
        return null;
    }

    public Shape getShape(String shape) {
        return null;
    }
}
