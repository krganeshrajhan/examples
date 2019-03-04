package example.java.design.patterns.principles.behavioral.visitor.intrinsic;

public class DoubleExpression extends Expression {

    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    public void print(StringBuilder sb) {
        sb.append(value);
    }
}
