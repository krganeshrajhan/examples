package example.design.pattern.behavioral.observer.builder;

import example.design.pattern.behavioral.observer.subject.Subject;

/**
 * Created by 1532082 on 12/7/2016.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
