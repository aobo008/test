package com.test.design_pattern.action.observer;

/**
 * Created by wanggy on 2017/10/27.
 *
 * ​
 *
 * 观察者模式优点：
    观察者模式在被观察者和观察者之间建立一个抽象的耦合。被观察者角色所知道的只是一个具体观察者列表，每一个具体观察者都符合一个抽象观察者的接口。被观察者并不认识任何一个具体观察者，
    它只知道它们都有一个共同的接口。由于被观察者和观察者没有紧密地耦合在一起，因此它们可以属于不同的抽象化层次。如果被观察者和观察者都被扔到一起，那么这个对象必然跨越抽象化和具体化层次。

     观察者模式缺点：
         如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
         如果在被观察者之间有循环依赖的话，被观察者会触发它们之间进行循环调用，导致系统崩溃。在使用观察者模式是要特别注意这一点。
         如果对观察者的通知是通过另外的线程进行异步投递的话，系统必须保证投递是以自恰的方式进行的。
         虽然观察者模式可以随时使观察者知道所观察的对象发生了变化，但是观察者模式没有相应的机制使观察者知道所观察的对象是怎么发生变化的。

     开发中常见场景：
         1.聊天室程序，服务器转发信息给所有客户端
         2.网络游戏（多人联机对战）场景中，服务器将客户端的状态进行分发
         3.邮件订阅
         4.Servlet中，监听器的实现
         5.Android的广播机制
         6.JDK的AWT中事件处理模型
 */
public class ObserverClient {
    public static void main(String[] args){
        SubjectDownload subject = new SubjectDownload();
        IObserver observer = new ObserverAdmin();

        subject.attach(observer);
        subject.processChange("start");
        subject.processChange("pause");
        subject.processChange("stop");
    }
}
