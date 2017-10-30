package com.test.design_pattern.creative.simpleFactory;

/**
 * Created by wanggy on 2017/10/26.
 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        Factory.getProductInstance(ProductTypeEnum.Ipad).showProductDescription();
        Factory.getProductInstance(ProductTypeEnum.Iphone).showProductDescription();
        Factory.getProductInstance(ProductTypeEnum.Mac).showProductDescription();
    }
}
