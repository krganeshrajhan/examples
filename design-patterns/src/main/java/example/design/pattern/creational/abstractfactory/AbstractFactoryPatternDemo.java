package example.design.pattern.creational.abstractfactory;

import example.design.pattern.creational.abstractfactory.builder.AbstractFactory;
import example.design.pattern.creational.abstractfactory.builder.FactoryProducer;
import example.design.pattern.creational.abstractfactory.color.Color;
import example.design.pattern.creational.abstractfactory.shape.Shape;

/**
 * Created by 1532082 on 9/1/2016.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape square = shapeFactory.getShape("SQUARE");
        rectangle.draw();
        circle.draw();
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        Color blue = colorFactory.getColor("BLUE");
        Color green = colorFactory.getColor("GREEN");
        red.fill();
        blue.fill();
        green.fill();
    }
}
