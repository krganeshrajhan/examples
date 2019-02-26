package example.java.design.patterns.principles.behavioral.memento;

public class Editor {

    private String state;

    public EditorMemento save() {
        return new EditorMemento(this.state);
    }

    public void restoreState(EditorMemento memento) {
        this.state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
