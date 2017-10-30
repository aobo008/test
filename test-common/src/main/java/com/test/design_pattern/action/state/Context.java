package com.test.design_pattern.action.state;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String str) {
        state.handleState(str);
    }
}