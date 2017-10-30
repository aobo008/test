package com.test.design_pattern.creative.builder;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConreteBuilder extends AbstractBuilder {
    private Product product = new Product();


    @Override
    public void buildId(long id) {
        product.setId(id);
    }

    @Override
    public void buildName(String name) {
        product.setName(name);
    }

    @Override
    public void buildLevel(int level) {
        product.setLevel(level);
    }

    @Override
    public void buildDescription(String description) {
        product.setDescription(description);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
