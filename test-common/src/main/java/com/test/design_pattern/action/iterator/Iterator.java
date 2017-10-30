package com.test.design_pattern.action.iterator;

/**
 * Created by wanggy on 2017/10/27.
 */
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
    Object currentItem();
}