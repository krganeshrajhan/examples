package example.design.pattern.structural.decorator;

import example.design.pattern.structural.decorator.builder.RedShapeDecorator;
import example.design.pattern.structural.decorator.shape.Circle;
import example.design.pattern.structural.decorator.shape.Rectangle;
import example.design.pattern.structural.decorator.shape.Shape;

/**
 * Created by krganeshrajhan on 14/9/16.
 */
public class DecoratorPatternDemo {

    public static void main(String [] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
