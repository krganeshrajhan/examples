package example.java.design.patterns.principles.behavioral.visitor.classic;

public class DoubleExpression extends Expression {

    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
