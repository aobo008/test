package com.test.design_pattern.action.state;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteStateFinish implements State {
    @Override
    public void handleState(String str) {
        System.out.println("State: finish, str="+str);
    }
}
