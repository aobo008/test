package com.test.design_pattern.action.command;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteCommand implements ICommand {
    @Override
    public void exec() {
        Receiver receiver = new Receiver();
        receiver.action();
    }
}
