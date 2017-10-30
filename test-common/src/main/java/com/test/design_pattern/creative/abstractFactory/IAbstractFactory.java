package com.test.design_pattern.creative.abstractFactory;

/**
 * Created by wanggy on 2017/10/27.
 */
public interface IAbstractFactory {
    public IProduct generateProduct();
    public IMaterial importMaterial();
}
