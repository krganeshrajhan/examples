package example.design.pattern.behavioral.observer.builder;

import example.design.pattern.behavioral.observer.subject.Subject;

/**
 * Created by 1532082 on 12/7/2016.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.add(this);
    }
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
