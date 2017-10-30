package com.test.design_pattern.action.command;

/**
 * Created by wanggy on 2017/10/27.
 *  命令模式优点：
         降低系统的耦合度。
         新的命令可以很容易地加入到系统中。由于增加新的具体命令类不会影响到其他类，因此增加新的具体命令类很容易，无须修改原有系统源代码，甚至客户类代码，满足“开闭原则”的要求。
         可以比较容易地设计一个命令队列或宏命令（组合命令）。
         为请求的撤销(Undo)和恢复(Redo)操作提供了一种设计和实现方案。

     命令模式缺点：
        使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个对请求接收者的调用操作都需要设计一个具体命令类，因此在某些系统中可能需要提供大量的具体命令类，这将影响命令模式的使用。

    使用场景：
         Struts2中action中的调用过程中存在命令模式
         数据库中的事务机制的底层实现
         命令的撤销和恢复：增加相应的撤销和恢复命令的方法（比如数据库中的事务回滚）
 */
public class CommandClient {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommand());
        invoker.calling();
    }
}