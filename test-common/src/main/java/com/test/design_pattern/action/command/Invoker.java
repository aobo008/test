package com.test.design_pattern.action.command;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Invoker {
    private ICommand ICommand;

    public Invoker(ICommand ICommand) {

        this.ICommand = ICommand;
    }

    public void setICommand(ICommand ICommand) {

        this.ICommand = ICommand;
    }

    public void calling() {
        if (ICommand != null) {
            ICommand.exec();
        }
    }
}
