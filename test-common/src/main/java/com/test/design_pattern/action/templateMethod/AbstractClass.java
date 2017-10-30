package com.test.design_pattern.action.templateMethod;

/**
 * Created by wanggy on 2017/10/27.
 */
public abstract class AbstractClass {

    protected abstract void absMethod();

    protected void hookMethod() {
        //base null
    }

    private final void concreteMethod() {
        System.out.println("Base Logic Code!");
    }

    public void templateMethod() {
        absMethod();
        hookMethod();
        concreteMethod();
    }
}