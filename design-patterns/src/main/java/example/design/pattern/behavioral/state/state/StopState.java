package example.design.pattern.behavioral.state.state;

import example.design.pattern.behavioral.state.builder.Context;

/**
 * Created by krganeshrajhan on 11/12/16.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("AT Stop State");
        context.setState(this);
    }
}
