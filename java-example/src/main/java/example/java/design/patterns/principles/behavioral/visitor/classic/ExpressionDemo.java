package example.java.design.patterns.principles.behavioral.visitor.classic;

import example.java.design.patterns.principles.behavioral.visitor.classic.AdditionExpression;
import example.java.design.patterns.principles.behavioral.visitor.classic.DoubleExpression;
import example.java.design.patterns.principles.behavioral.visitor.classic.Expression;

public class ExpressionDemo {

    public static void main(String[] args) {
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)));

        PrintVisitor visitor = new PrintVisitor();
        visitor.visit(e);
        System.out.println(visitor.sb.toString());

    }
}
