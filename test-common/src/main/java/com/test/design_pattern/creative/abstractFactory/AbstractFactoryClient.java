package com.test.design_pattern.creative.abstractFactory;

/**
 * Created by wanggy on 2017/10/27.
 *
 *
 *  抽象工厂模式的优点：
         和前面一样，隔离具体类的生成，使客户并不需要知道什么被创建。
         增加新的产品族很方便，无须修改已有系统，符合“开闭原则”。

    抽象工厂模式的缺点：
        增加新的产品等级结构麻烦，需要对原有系统进行较大的修改，甚至需要修改抽象层代码，违背“开闭原则”。

    抽象工厂模式
        不可以增加产品中某一个配件，可以增加一个具体的产品族。
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        IAbstractFactory factory = new FactoryChina();
        IProduct product = factory.generateProduct();
        IMaterial material = factory.importMaterial();
        product.showProduct();
        material.showMaterial();

        factory = new FactoryAmerican();
        product = factory.generateProduct();
        material = factory.importMaterial();
        product.showProduct();
        material.showMaterial();
    }
}
