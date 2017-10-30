package com.test.design_pattern.structure.bridge;

/**
 * Created by wanggy on 2017/10/26.
 *
 *  桥接模式优点如下：
         分离抽象接口及其实现部分。桥接模式使用“对象间的关联关系”解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自的维度来变化。所谓抽象和实现沿着各自维度的变化，也就是说抽象和实现不再在同一个继承层次结构中，而是“子类化”它们，使它们各自都具有自己的子类，以便任何组合子类，从而获得多维度组合对象。
         很多情况下桥接模式可以取代多层继承方案，多层继承方案违背了“单一职责原则”，复用性较差，且类的个数非常多，桥接模式是比多层继承方案更好的解决方法，它极大减少了子类的个数。
         桥接模式提高了系统的可扩展性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统，符合“开闭原则”。

    桥接模式缺点如下：
         桥接模式的使用会增加系统的理解与设计难度，由于关联关系建立在抽象层，要求开发者一开始就针对抽象层进行设计与编程。
         桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性，如何正确识别两个独立维度也需要一定的经验积累。

    桥接模式实际开发中应用场景
         JDBC驱动程序
         AWT中的Pear架构
         银行日志管理：
             格式分类：操作日志，交易日志，异常日志
             距离分类：本地记录日志，异地记录日志
         人力资源系统中的奖金计算模块：
             奖金分类：个人奖金，团体奖金，项目奖金，激励奖金
             部门分类：人事部，销售部，研发部
         OA系统中的消息处理：
             业务类型：普通消息，加急消息，特急消息
             ​发送消息方式：系统内消息，手机短信，邮件

 */
public class BridgeClient {
    public static void main(String[] args){
        AbstractMonkey monkeyServer = new MonkeyServer();
        AbstractMonkey monkeyMobile= new MobileMonkey();

        //使用windows平台
        AbstractPlatform platform = new PlatformWindows(monkeyServer);
        platform.program();
        AbstractCompany company = new CompanyGoogle(platform);
        company.work();

        platform = new PlatformWindows(monkeyMobile);
        platform.program();
        company = new CompanyGoogle(platform);
        company.work();

        //使用linux平台
        platform = new PlatformLinux(monkeyServer);
        platform.program();
        company = new CompanyGoogle(platform);
        company.work();

        platform = new PlatformLinux(monkeyMobile);
        platform.program();
        company = new CompanyGoogle(platform);
        company.work();
    }
}
