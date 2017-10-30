package com.test.design_pattern.action.visitor;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteVisitorB implements IVisitor {
    @Override
    public void visit(ConcreteElementNodeA node) {
        System.out.println(node.operateA());
    }

    @Override
    public void visit(ConcreteElementNodeB node) {
        System.out.println(node.operateB());
    }
}
