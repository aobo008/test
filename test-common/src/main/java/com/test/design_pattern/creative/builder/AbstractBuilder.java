package com.test.design_pattern.creative.builder;

/**
 * Created by wanggy on 2017/10/27.
 */
public abstract class AbstractBuilder {
    public abstract void buildId(long id);
    public abstract void buildName(String name);
    public abstract void buildLevel(int level);
    public abstract void buildDescription(String description);

    public abstract Product getProduct();
}
