package example.design.pattern.structural.facade;

import example.design.pattern.structural.facade.builder.ShapeMaker;

/**
 * Created by 1532082 on 9/14/2016.
 */
public class FacadePatternDemo {

    public static void main(String [] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
