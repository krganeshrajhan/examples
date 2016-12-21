package example.design.pattern.behavioral.visitor.builder;

import example.design.pattern.behavioral.visitor.computer.Computer;
import example.design.pattern.behavioral.visitor.computer.Keyboard;
import example.design.pattern.behavioral.visitor.computer.Monitor;
import example.design.pattern.behavioral.visitor.computer.Mouse;

/**
 * Created by 1532082 on 12/21/2016.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
