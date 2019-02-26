package example.java.design.patterns.principles.behavioral.memento;

public class EditorMemento {

    private String state;

    public EditorMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
