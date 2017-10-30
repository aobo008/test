package com.test.design_pattern.action.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanggy on 2017/10/27.
 * 迭代器模式优点：
         它支持以不同的方式遍历一个聚合对象，在同一个聚合对象上可以定义多种遍历方式。
         迭代器简化了聚合类。由于引入了迭代器，在原有的聚合对象中不需要再自行提供数据遍历等方法，这样可以简化聚合类的设计。
         在迭代器模式中，由于引入了抽象层，增加新的聚合类和迭代器类都很方便，无须修改原有代码，满足“开闭原则”的要求。

     迭代器模式缺点：
         由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。
         抽象迭代器的设计难度较大，需要充分考虑到系统将来的扩展，例如JDK内置迭代器Iterator就无法实现逆向遍历，如果需要实现逆向遍历，只能通过其子类ListIterator等来实现，
         而ListIterator迭代器无法用于操作Set类型的聚合对象。在自定义迭代器时，创建一个考虑全面的抽象迭代器并不是件很容易的事情。



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
