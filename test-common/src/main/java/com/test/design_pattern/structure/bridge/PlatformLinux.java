package com.test.design_pattern.structure.bridge;

/**
 * Created by wanggy on 2017/10/26.
 */
class PlatformLinux extends AbstractPlatform {
    public PlatformLinux(AbstractMonkey monkey) {
        this.monkey = monkey;
    }

    @Override
    public void program() {
        monkey.type();
        System.out.println("使用linux平台！\n");
    }
}
