package example.java.design.patterns.principles.behavioral.visitor.classic;

public class PrintVisitor implements ExpressionVisitor {

    public StringBuilder sb = new StringBuilder();

    public void visit(AdditionExpression e) {
        sb.append("(");
        e.left.accept(this);
        sb.append("+");
        e.right.accept(this);
        sb.append(")");
    }

    public void visit(DoubleExpression e) {
        sb.append(e.value);
    }
}
