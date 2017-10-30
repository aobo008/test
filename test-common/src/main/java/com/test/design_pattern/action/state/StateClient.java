package com.test.design_pattern.action.state;

/**
 * Created by wanggy on 2017/10/27.
 *
 * 状态模式优点：
         封装了状态的转换规则，在状态模式中可以将状态的转换代码封装在环境类或者具体状态类中，可以对状态转换代码进行集中管理，而不是分散在一个个业务方法中。
         将所有与某个状态有关的行为放到一个类中，只需要注入一个不同的状态对象即可使环境对象拥有不同的行为。
         允许状态转换逻辑与状态对象合成一体，而不是提供一个巨大的条件语句块，状态模式可以让我们避免使用庞大的条件语句来将业务方法和状态转换代码交织在一起。
         可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数。

    状态模式缺点：
         状态模式的使用必然会增加系统中类和对象的个数，导致系统运行开销增大。
         状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱，增加系统设计的难度。
         状态模式对“开闭原则”的支持并不太好，增加新的状态类需要修改那些负责状态转换的源代码，否则无法转换到新增状态；而且修改某个状态类的行为也需修改对应类的源代码。

 */
public class StateClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateWating());
        context.request("1");
        context.setState(new ConcreteStateLoading());
        context.request("2");
        context.setState(new ConcreteStateFinish());
        context.request("3");
        context.setState(new ConcreteStateError());
        context.request("e");
    }
}
