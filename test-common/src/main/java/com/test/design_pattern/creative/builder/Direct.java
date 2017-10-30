package com.test.design_pattern.creative.builder;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Direct {
    private AbstractBuilder builder = new ConreteBuilder();

    public Product getHighLevelProduct(){
        builder.buildId(1);
        builder.buildName("首个产品");
        builder.buildLevel(1);
        builder.buildDescription("高端产品");

        return builder.getProduct();
    }

    public Product getLowLevelProduct(){
        builder.buildId(2);
        builder.buildName("第二产品");
        builder.buildLevel(2);
        builder.buildDescription("低端产品");

        return builder.getProduct();
    }
}
