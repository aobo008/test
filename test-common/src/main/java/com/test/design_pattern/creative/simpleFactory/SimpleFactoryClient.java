package com.test.design_pattern.creative.simpleFactory;

/**
 * Created by wanggy on 2017/10/26.
 *
 *      简单工厂模式的主要优点如下：
             客户端可以免除直接创建对象的职责，只关心使用对象，简单工厂模式实现了对象创建和使用的分离。
             客户端不用知道创建的产品类具体类名，只要知道具体产品类所对应的参数即可。
             通过配置文件，提高了系统灵活性。

        简单工厂模式的主要缺点如下：
             工厂类负责所有对象的创建逻辑，该类出问题整个系统挂掉。
             系统扩展困难，一旦添加新产品就不得不修改工厂逻辑。
             简单工厂模式由于使用了静态工厂方法，所以工厂角色无法形成基于继承的等级结构。

        应用场景
             JDK中的Calendar的getInstance方法
             JDBC中Connection对象的获取getConnection
             Hibernate中SessionFactory创建Session
             spring中的IOC容器创建管理bean对象的时候也是工厂模式
             XML解析时的DocumentBuilderFactory创建解析器对象
             反射中Class对象的newInstance方法。

 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        Factory.getProductInstance(ProductTypeEnum.Ipad).showProductDescription();
        Factory.getProductInstance(ProductTypeEnum.Iphone).showProductDescription();
        Factory.getProductInstance(ProductTypeEnum.Mac).showProductDescription();
    }
}
