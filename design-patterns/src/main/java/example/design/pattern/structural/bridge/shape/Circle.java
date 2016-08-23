package example.design.pattern.structural.bridge.shape;

import example.design.pattern.structural.bridge.builder.DrawAPI;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
