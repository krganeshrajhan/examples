package example.design.pattern.behavioral.observer;

import example.design.pattern.behavioral.observer.builder.BinaryObserver;
import example.design.pattern.behavioral.observer.subject.Subject;

/**
 * Created by 1532082 on 12/7/2016.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

//        new HexaObserver(subject);
//        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
