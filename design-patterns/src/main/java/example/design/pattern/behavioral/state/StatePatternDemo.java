package example.design.pattern.behavioral.state;

import example.design.pattern.behavioral.state.builder.Context;
import example.design.pattern.behavioral.state.state.StartState;
import example.design.pattern.behavioral.state.state.StopState;

/**
 * Created by krganeshrajhan on 11/12/16.
 */
public class StatePatternDemo {
    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
