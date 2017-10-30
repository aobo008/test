package com.test.design_pattern.structure.bridge;

/**
 * Created by wanggy on 2017/10/26.
 */
public class CompanyGoogle extends AbstractCompany {

    public CompanyGoogle(AbstractPlatform platform) {
        this.abstractPlatform = platform;
    }

    @Override
    public void work() {
        System.out.print("Google公司的，");
        this.abstractPlatform.program();
    }
}
