package com.test.design_pattern.action.visitor;

/**
 * Created by wanggy on 2017/10/27.
 */
interface IVisitor {
    void visit(ConcreteElementNodeA node);

    void visit(ConcreteElementNodeB node);
}
