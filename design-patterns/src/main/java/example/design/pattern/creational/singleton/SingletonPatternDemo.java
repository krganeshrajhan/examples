package example.design.pattern.creational.singleton;

/**
 * Created by 1532082 on 7/20/2016.
 */
public class SingletonPatternDemo {

    public static void main(String [] args) {
        SingletonExample1 example1 = SingletonExample1.getInstance();
        SingletonExample1 example2 = SingletonExample1.getInstance();
        if(example1==example2) {
            System.out.println("true");
        }
    }
}
