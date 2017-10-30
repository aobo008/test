package com.test.design_pattern.creative.simpleFactory;

/**
 * Created by wanggy on 2017/10/26.
 */
public class Factory {
    public static IProduct getProductInstance(ProductTypeEnum typeEnum) {
        IProduct product;
        switch (typeEnum.getValue()) {
            case 1:
                product = new ProductIphone();
                break;
            case 2:
                product = new ProductMac();
                break;
            case 3:
                product = new ProductIpad();
                break;
            default:
                product = null;
                break;
        }

        return product;
    }
}
