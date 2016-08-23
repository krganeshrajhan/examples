package example.design.pattern.structural.bridge.shape;

import example.design.pattern.structural.bridge.builder.DrawAPI;

/**
 * Created by 1532082 on 7/11/2016.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
