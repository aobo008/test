package com.test.design_pattern.creative.simpleFactory;

/**
 * Created by wanggy on 2017/10/26.
 */
public class ProductIpad implements IProduct {
    @Override
    public void showProductDescription() {
        System.out.println("我是Ipad");
    }
}