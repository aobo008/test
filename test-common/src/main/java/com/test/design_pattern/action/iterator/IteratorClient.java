package com.test.design_pattern.action.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanggy on 2017/10/27.
 */
public class IteratorClient {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add("Android");
        list.add("PHP");
        list.add("C Language");

        Container container = new ConcreteContainer(list);
        container.add("HardWare");

        Iterator iterator = container.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
