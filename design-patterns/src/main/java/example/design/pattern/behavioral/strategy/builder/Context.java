package example.design.pattern.behavioral.strategy.builder;

import example.design.pattern.behavioral.strategy.strategy.Strategy;

/**
 * Created by 1532082 on 12/13/2016.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
