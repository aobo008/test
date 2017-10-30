package com.test.design_pattern.action.mediator;

/**
 * Created by wanggy on 2017/10/27.
 *
 * 中介者模式优点：
         简化了对象之间的交互，它用中介者和同事的一对多交互代替了原来同事之间的多对多交互，一对多关系更容易理解、维护和扩展，将原本难以理解的网状结构转换成相对简单的星型结构。
         可将各同事对象解耦。
         可以减少子类生成，中介者将原本分布于多个对象间的行为集中在一起，改变这些行为只需生成新的中介者子类即可，这使各个同事类可被重用，无须对同事类进行扩展。

    中介者模式缺点：
         在具体中介者类中包含了大量同事之间的交互细节，可能会导致具体中介者类非常复杂，使得系统难以维护。

    开发中常见应用场景：
        MVC模式中的C部分，M和V都和它打交道
        Java.lang.reflect.Method#invoke()​
 */
public class MediatorClient {
    public static void main(String[] args){
        ConcreteMediator mediator= new ConcreteMediator();
        ConcreteColleagueHR hr = new ConcreteColleagueHR("Google招聘专员",mediator);
        ConcreteColleagueAndroidDeveloper ad = new ConcreteColleagueAndroidDeveloper("程序员",mediator);

        mediator.setHr(hr);
        mediator.setAd(ad);

        hr.constact("   Hi，你有意向来我们公司吗？");
        ad.constact("   是google开发Andriod的岗位吗？");
        hr.constact("   yes！");
        ad.constact("   I do");
    }
}
