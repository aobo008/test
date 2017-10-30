package com.test.design_pattern.creative.factoryMethod;

/**
 * Created by wanggy on 2017/10/27.
 */
public class FactoryAmerican implements IFactory {

    public IProduct generateProduct() {
        return new ProductMac();
    }
}
