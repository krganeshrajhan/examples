package example.java.design.patterns.principles.behavioral.visitor.intrinsic;

public class AdditionExpression extends Expression {

    private Expression left;
    private Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public void print(StringBuilder sb) {
        sb.append("(");
        left.print(sb);
        sb.append("+");
        right.print(sb);
        sb.append(")");
    }
}
