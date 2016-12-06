package example.design.pattern.behavioral.memento.memento;

/**
 * Created by 1532082 on 12/6/2016.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        setState(memento.getState());
    }
}
