package example.design.pattern.creational.abstractfactory.builder;

/**
 * Created by 1532082 on 9/1/2016.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if(choice.equals("SHAPE")) {
            return new ShapeFactory();
        } else if(choice.equals("COLOR")) {
            return new ColorFactory();
        }
        return  null;
    }
}
