package com.test.design_pattern.action.mediator;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteColleagueHR extends Colleague {
    public ConcreteColleagueHR(String name, AbstractMediator mediator)
    {

        super(name, mediator);
    }

    public void constact(String message)
    {

        mediator.constact(message, this);
    }

    public void getMessage(String msg)
    {

        System.out.println("HR#" + name + "#:" + msg);
    }
}
