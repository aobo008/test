package com.test.design_pattern.structure.bridge;

/**
 * Created by wanggy on 2017/10/26.
 */
public class CompanyBaidu extends AbstractCompany {

    public CompanyBaidu(AbstractPlatform platform) {
        this.abstractPlatform = platform;
    }

    @Override
    public void work() {
        System.out.print("Baidu公司的，");
        this.abstractPlatform.program();
    }
}
