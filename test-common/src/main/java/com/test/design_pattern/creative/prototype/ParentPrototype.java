package com.test.design_pattern.creative.prototype;

/**
 * Created by wanggy on 2017/10/26.
 */
public class ParentPrototype implements Cloneable {

    @Override
    protected ParentPrototype clone() throws CloneNotSupportedException {
        ParentPrototype parentPrototype = (ParentPrototype) super.clone();
        return parentPrototype;
    }
}
