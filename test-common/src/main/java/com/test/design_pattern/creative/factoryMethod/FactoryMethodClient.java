package com.test.design_pattern.creative.factoryMethod;

/**
 * Created by wanggy on 2017/10/27.
 *
 * 工厂方法模式的主要优点如下：
     在工厂方法模式中，工厂方法用来创建客户化产品，向客户隐藏产品实例化细节，用户只需要关心所需产品对应的工厂，无须关心创建细节。
     基于工厂角色和产品角色的多态性设计是工厂方法模式的关键，它能够让工厂可以自主确定创建何种产品对象，而如何创建这个对象的细节则完全封装在具体工厂内部。
     在系统中加入新产品时，无须修改抽象工厂和抽象产品提供的接口，无须修改客户端，也无须修改其他的具体工厂和具体产品，完全符合“开闭原则”。

    工厂方法模式的主要缺点如下：
     在添加新产品时，需要编写新的具体产品类，而且还要提供与之对应的具体工厂类，系统中类的个数将成对增加，在一定程度上增加了系统的复杂度，有更多的类需要编译和运行，会给系统带来一些额外的开销。
     由于考虑到系统的可扩展性，需要引入抽象层，在客户端代码中均使用抽象层进行定义，增加了系统的抽象性和理解难度。

 */
public class FactoryMethodClient {
    public static void main(String[] args){
        IFactory factory = new FactoryChina();
        IProduct product = factory.generateProduct();
        product.showProduct();

        factory = new FactoryAmerican();
        product = factory.generateProduct();
        product.showProduct();
    }
}
