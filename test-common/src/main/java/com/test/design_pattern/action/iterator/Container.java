package com.test.design_pattern.action.iterator;

/**
 * Created by wanggy on 2017/10/27.
 */
interface Container {
    void add(Object obj);
    void remove(Object obj);
    com.test.design_pattern.action.iterator.Iterator createIterator();
}