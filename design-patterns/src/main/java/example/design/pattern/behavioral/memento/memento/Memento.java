package example.design.pattern.behavioral.memento.memento;

/**
 * Created by 1532082 on 12/6/2016.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
