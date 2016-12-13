package example.design.pattern.behavioral.state.builder;

import example.design.pattern.behavioral.state.state.State;

/**
 * Created by krganeshrajhan on 11/12/16.
 */
public class Context {
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    private State state;
}
