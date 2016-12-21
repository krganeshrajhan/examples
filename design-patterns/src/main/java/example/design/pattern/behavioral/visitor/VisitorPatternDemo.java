package example.design.pattern.behavioral.visitor;

import example.design.pattern.behavioral.visitor.builder.ComputerPartDisplayVisitor;
import example.design.pattern.behavioral.visitor.computer.Computer;
import example.design.pattern.behavioral.visitor.computer.ComputerPart;

/**
 * Created by 1532082 on 12/21/2016.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
