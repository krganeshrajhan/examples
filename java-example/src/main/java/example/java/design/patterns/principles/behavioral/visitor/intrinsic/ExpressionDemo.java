package example.java.design.patterns.principles.behavioral.visitor.intrinsic;

public class ExpressionDemo {

    public static void main(String[] args) {
        Expression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)));
        StringBuilder sb = new StringBuilder();
        e.print(sb);
        System.out.println(sb.toString());
    }
}
