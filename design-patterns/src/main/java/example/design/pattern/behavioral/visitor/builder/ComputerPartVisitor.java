package example.design.pattern.behavioral.visitor.builder;

import example.design.pattern.behavioral.visitor.computer.Computer;
import example.design.pattern.behavioral.visitor.computer.Keyboard;
import example.design.pattern.behavioral.visitor.computer.Monitor;
import example.design.pattern.behavioral.visitor.computer.Mouse;

/**
 * Created by 1532082 on 12/21/2016.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
