package com.test.design_pattern.action.responsibilityChain;

/**
 * Created by wanggy on 2017/10/27.
 *
 *  职责链模式优点：
         职责链模式使得一个对象无须知道是其他哪一个对象处理其请求，对象仅需知道该请求会被处理即可，接收者和发送者都没有对方的明确信息，且链中的对象不需要知道链的结构，由客户端负责链的创建，降低了系统的耦合度。
         请求处理对象仅需维持一个指向其后继者的引用，而不需要维持它对所有的候选处理者的引用，可简化对象的相互连接。
         在给对象分派职责时，职责链可以给我们更多的灵活性，可以通过在运行时对该链进行动态的增加或修改来增加或改变处理一个请求的职责。
         在系统中增加一个新的具体请求处理者时无须修改原有系统的代码，只需要在客户端重新建链即可，从这一点来看是符合“开闭原则”的。

    职责链模式缺点：
         因为一个请求没有明确的接收者，所以不能保证它一定会被处理，该请求可能一直到链的末端都得不到处理；一个请求也可能因职责链没有被正确配置而得不到处理。
         对于比较长的职责链，请求的处理可能涉及到多个处理对象，系统性能将受到一定影响，而且在进行代码调试时不太方便。
         如果建链不当，可能会造成循环调用，将导致系统陷入死循环。

     实现方式：
         1、链表方式：比如刚才的请假审批
         2、非链表方式：通过集合，数组生成责任链更加实用，将链表上的各个对象都添加到集合中，然后通过反射给构建出来。
         然后在容器里一个个的处理。（也就是说把测试代码中除了请假的其他代码都给用一个类来处理）

    开发中常见场景：
         1、Java的异常机制就是一个责任链模式，一个try可以对应多个catch。如果某一个catch不匹配，则跳到下一个catch中
         2、JavaScript语言中的事件的冒泡和捕获机制
         3、Servlet开发中，过滤器的链式处理
         4、Struts2中，拦截器的调用也是典型的责任链模式

 */
public class ChainClient {
    public static void main(String[] args) {
        Handler code = new ConcreteHandlerTeamLeader();
        Handler ui = new ConcreteHandlerGUI();
        Handler test = new ConcreteHandlerTestEngineer();
        Handler publish = new ConcreteHandlerPM();

        code.setmHandler(ui);
        ui.setmHandler(test);
        test.setmHandler(publish);
        //Alf找team leader review代码
        System.out.println(code.handleRequest(Type.CODE_FORMAT, "Alf"));
        //Alf找team leader测试代码
        System.out.println(code.handleRequest(Type.TEST_PROJECT, "Alf"));
    }
}
