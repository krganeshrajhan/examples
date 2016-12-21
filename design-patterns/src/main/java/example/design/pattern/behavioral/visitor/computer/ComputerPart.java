package example.design.pattern.behavioral.visitor.computer;

import example.design.pattern.behavioral.visitor.builder.ComputerPartVisitor;

/**
 * Created by 1532082 on 12/21/2016.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
