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
        //yanbo找team leader review代码
        System.out.println(code.handleRequest(Type.CODE_FORMAT, "YanBo"));
        //yanbo找team leader测试代码
        System.out.println(code.handleRequest(Type.TEST_PROJECT, "YanBo"));
    }
}
