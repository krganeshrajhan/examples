package example.design.pattern.structural.decorator.builder;

import example.design.pattern.structural.decorator.shape.Shape;

/**
 * Created by krganeshrajhan on 14/9/16.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
