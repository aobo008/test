package com.test.design_pattern.action.command;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void calling() {
        if (command != null) {
            command.exec();
        }
    }
}
