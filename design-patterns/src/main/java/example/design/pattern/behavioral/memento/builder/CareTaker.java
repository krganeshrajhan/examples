package example.design.pattern.behavioral.memento.builder;

import example.design.pattern.behavioral.memento.memento.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1532082 on 12/6/2016.
 */
public class CareTaker {

    List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }


    public Memento get(int i) {
        return mementoList.get(i);
    }
}
