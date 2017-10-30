package com.test.design_pattern.action.mediator;

/**
 * Created by wanggy on 2017/10/27.
 */
public abstract class Colleague {
    protected String name;
    protected AbstractMediator mediator;

    public Colleague(String name,AbstractMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}
