package com.test.design_pattern.action.visitor;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteElementNodeB extends AbstractElementNode {
    @Override
    public void accept(IVisitor IVisitor) {
        IVisitor.visit(this);
    }

    public String operateB() {
        return "ConcreteElementNodeB";
    }
}
