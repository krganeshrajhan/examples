package example.design.pattern.structural.bridge.builder;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
