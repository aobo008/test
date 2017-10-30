package com.test.design_pattern.creative.prototype;

/**
 * Created by wanggy on 2017/10/26.
 */
public class ConcretePrototype extends ParentPrototype {
    public void printHashCode() {

        System.out.println("ConcretePrototype hashcode=" + this.hashCode());
    }
}
