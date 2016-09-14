package example.design.pattern.structural.decorator.builder;

import example.design.pattern.structural.decorator.shape.Shape;

/**
 * Created by krganeshrajhan on 14/9/16.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
