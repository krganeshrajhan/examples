package example.design.pattern.structural.proxy.builder;

import example.design.pattern.structural.proxy.image.Image;
import example.design.pattern.structural.proxy.image.RealImage;

/**
 * Created by 1532082 on 9/15/2016.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if(realImage==null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
