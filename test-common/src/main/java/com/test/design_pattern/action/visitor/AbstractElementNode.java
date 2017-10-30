package com.test.design_pattern.action.visitor;

/**
 * Created by wanggy on 2017/10/27.
 */
public abstract class AbstractElementNode {
    public abstract void accept(IVisitor vistor);
}
