package com.test.design_pattern.creative.factoryMethod;

/**
 * Created by wanggy on 2017/10/27.
 */
public class FactoryChina implements IFactory {

    public IProduct generateProduct() {
        return new ProductLenovo();
    }
}
