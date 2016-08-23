package example.design.pattern.structural.bridge;

import example.design.pattern.structural.bridge.builder.GreenCircle;
import example.design.pattern.structural.bridge.builder.RedCircle;
import example.design.pattern.structural.bridge.shape.Circle;
import example.design.pattern.structural.bridge.shape.Shape;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
