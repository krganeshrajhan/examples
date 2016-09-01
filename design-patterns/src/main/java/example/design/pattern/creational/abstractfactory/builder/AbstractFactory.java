package example.design.pattern.creational.abstractfactory.builder;

import example.design.pattern.creational.abstractfactory.color.Color;
import example.design.pattern.creational.abstractfactory.shape.Shape;

/**
 * Created by 1532082 on 9/1/2016.
 */
public interface AbstractFactory {
    public Color getColor(String Color);
    public Shape getShape(String shape);
}
