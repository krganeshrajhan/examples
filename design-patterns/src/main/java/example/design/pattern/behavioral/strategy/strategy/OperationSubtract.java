package example.design.pattern.behavioral.strategy.strategy;

/**
 * Created by 1532082 on 12/13/2016.
 */
public class OperationSubtract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
