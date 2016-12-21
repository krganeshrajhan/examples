package example.design.pattern.behavioral.visitor.computer;

import example.design.pattern.behavioral.visitor.builder.ComputerPartVisitor;

/**
 * Created by 1532082 on 12/21/2016.
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
