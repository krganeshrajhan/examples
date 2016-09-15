package example.design.pattern.structural.facade.builder;

import example.design.pattern.creational.abstractfactory.shape.Circle;
import example.design.pattern.creational.abstractfactory.shape.Rectangle;
import example.design.pattern.creational.abstractfactory.shape.Square;

/**
 * Created by 1532082 on 9/14/2016.
 */
public class ShapeMaker {

    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
