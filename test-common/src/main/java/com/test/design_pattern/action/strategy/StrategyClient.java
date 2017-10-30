package com.test.design_pattern.action.strategy;

/**
 * Created by wanggy on 2017/10/27.
 *
 * 策略模式优点：
         策略模式完全符合“开闭原则”。
         策略模式提供了管理相关算法族的办法。恰当使用继承可以把公共的代码移到抽象策略类中，从而避免重复的代码。
         策略模式提供了一种可以替换继承关系的办法。如果不使用策略模式，那么使用算法的环境类就可能会有一些子类，每一个子类提供一种不同的算法。但是，这样一来算法的使用就和算法本身混在一起，不符合“单一职责原则”，而且使用继承无法实现算法或行为在程序运行时的动态切换。
         使用策略模式可以避免多重条件选择语句。

     策略模式缺点：
         客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
         策略模式将造成系统产生很多具体策略类，任何细小的变化都将导致系统要增加一个新的具体策略类。
         无法同时在客户端使用多个策略类，也就是说，在使用策略模式时，客户端每次只能使用一个策略类，不支持使用一个策略类完成部分功能后再使用另一个策略类来完成剩余功能的情况。

 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyJava());
        context.programLanguage();

        context.setStrategy(new ConcreteStrategyC());
        context.programLanguage();

        context.setStrategy(new ConcreteStrategyWeb());
        context.programLanguage();
    }
}
