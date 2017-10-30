package com.test.design_pattern.action.iterator;

import java.util.List;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteIterator  implements Iterator {
    private List<Object> list;
    private int cursor;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        cursor = 0;
        return list.get(cursor);
    }

    @Override
    public Object next() {
        Object ret = null;
        if (hasNext()) {
            ret = list.get(cursor);
        }
        cursor++;
        return ret;
    }

    @Override
    public boolean hasNext() {
        return !(cursor == list.size());
    }

    @Override
    public Object currentItem() {
        return list.get(cursor);
    }
}