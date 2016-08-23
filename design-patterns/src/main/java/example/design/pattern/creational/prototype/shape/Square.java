package example.design.pattern.creational.prototype.shape;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
