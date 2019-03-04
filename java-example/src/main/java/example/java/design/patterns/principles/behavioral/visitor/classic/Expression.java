package example.java.design.patterns.principles.behavioral.visitor.classic;

public abstract class Expression {

    abstract void accept(ExpressionVisitor visitor);
}
