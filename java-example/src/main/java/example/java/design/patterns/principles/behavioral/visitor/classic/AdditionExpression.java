package example.java.design.patterns.principles.behavioral.visitor.classic;

public class AdditionExpression extends Expression {

    public Expression left;
    public Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
