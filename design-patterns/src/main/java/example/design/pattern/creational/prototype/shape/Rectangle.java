package example.design.pattern.creational.prototype.shape;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
