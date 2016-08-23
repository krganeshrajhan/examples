package example.design.pattern.creational.factory.builder;

import example.design.pattern.creational.factory.shape.Circle;
import example.design.pattern.creational.factory.shape.Rectangle;
import example.design.pattern.creational.factory.shape.Shape;
import example.design.pattern.creational.factory.shape.Square;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
