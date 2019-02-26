package example.java.design.patterns.principles.behavioral.memento;

public class MementoMain {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setState("ON");
        EditorMemento onMemento = editor.save();
        editor.setState("OFF");
        editor.restoreState(onMemento);
        System.out.println(editor.getState());
    }
}
