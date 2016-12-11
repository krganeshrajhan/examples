package example.design.pattern.behavioral.state.state;

import example.design.pattern.behavioral.state.builder.Context;

/**
 * Created by krganeshrajhan on 11/12/16.
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("At start state");
        context.setState(this);
    }
}
