package example.design.pattern.structural.proxy;

import example.design.pattern.structural.proxy.builder.ProxyImage;
import example.design.pattern.structural.proxy.image.Image;
import example.design.pattern.structural.proxy.image.RealImage;

/**
 * Created by 1532082 on 9/15/2016.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image realImage = new RealImage("test_10mb.jpg");
        realImage.display();
        realImage.display();
        System.out.println("");
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
