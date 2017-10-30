package com.test.design_pattern.action.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ObjectStructure {
    private List<AbstractElementNode> nodeList = new ArrayList<AbstractElementNode>();

    public void action(IVisitor IVisitor){
        for(AbstractElementNode node: nodeList){
            node.accept(IVisitor);
        }
    }

    public void add(AbstractElementNode node){
        nodeList.add(node);
    }
}
