package example.design.pattern.creational.singleton.builder;

/**
 * Created by 1532082 on 7/20/2016.
 */
public class SingletonExample1 {

    private static SingletonExample1 instance = null;

    private SingletonExample1() {

    }

    public static SingletonExample1 getInstance() {
        if(instance==null) {
            instance = new SingletonExample1();
            return instance;
        } else {
            return instance;
        }
    }
}
