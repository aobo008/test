package com.test.design_pattern.creative.abstractFactory;

/**
 * Created by wanggy on 2017/10/27.
 */
public class FactoryAmerican implements IAbstractFactory {
    @Override
    public IProduct generateProduct() {
return new ProductMac();
    }

    @Override
    public IMaterial importMaterial() {

       return new MaterialMetal();
    }
}
