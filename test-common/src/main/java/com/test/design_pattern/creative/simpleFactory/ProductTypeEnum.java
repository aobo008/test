package com.test.design_pattern.creative.simpleFactory;

import com.test.IEnum;

/**
 * Created by wanggy on 2017/10/26.
 */
public enum ProductTypeEnum implements IEnum {
    /**
     *  Iphone
     *  Mac
     *  Ipad
     *
     */
    Iphone(1),
    Mac(2),
    Ipad(3);

    private int value;

    ProductTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
