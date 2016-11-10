package example.design.pattern.behavioral.interpreter.builder;

/**
 * Created by 1532082 on 10/17/2016.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpret(String context) {

        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
