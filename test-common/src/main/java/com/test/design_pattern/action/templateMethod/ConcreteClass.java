package com.test.design_pattern.action.templateMethod;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteClass extends AbstractClass {

    @Override
    protected void absMethod() {
        System.out.println("Signal Logic Code!");
    }

    @Override
    protected void hookMethod() {
        super.hookMethod();
        System.out.println("hookMethod Logic Code!");
    }
}