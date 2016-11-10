package example.design.pattern.behavioral.interpreter;

import example.design.pattern.behavioral.interpreter.builder.AndExpression;
import example.design.pattern.behavioral.interpreter.builder.Expression;
import example.design.pattern.behavioral.interpreter.builder.OrExpression;
import example.design.pattern.behavioral.interpreter.builder.TerminalExpression;

/**
 * Created by 1532082 on 10/17/2016.
 */
public class InterpreterPatternDemo {

    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
