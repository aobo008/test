package com.test.design_pattern.creative.abstractFactory;

/**
 * Created by wanggy on 2017/10/27.
 */
public class FactoryChina implements IAbstractFactory {
    @Override
    public IProduct generateProduct() {
        return new ProductLenovo();
    }

    @Override
    public IMaterial importMaterial() {
        return new MaterialWater();
    }
}
