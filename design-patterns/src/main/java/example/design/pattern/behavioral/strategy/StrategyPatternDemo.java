package example.design.pattern.behavioral.strategy;


import example.design.pattern.behavioral.strategy.builder.Context;
import example.design.pattern.behavioral.strategy.strategy.OperationAdd;
import example.design.pattern.behavioral.strategy.strategy.OperationMultiply;
import example.design.pattern.behavioral.strategy.strategy.OperationSubtract;

/**
 * Created by 1532082 on 12/13/2016.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
