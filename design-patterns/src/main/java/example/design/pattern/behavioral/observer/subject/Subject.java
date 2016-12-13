package example.design.pattern.behavioral.observer.subject;

import example.design.pattern.behavioral.observer.builder.BinaryObserver;
import example.design.pattern.behavioral.observer.builder.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1532082 on 12/7/2016.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void add(Observer observer) {
        observers.add(observer);
    }


}
