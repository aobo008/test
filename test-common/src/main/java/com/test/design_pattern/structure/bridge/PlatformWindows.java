package com.test.design_pattern.structure.bridge;

/**
 * Created by wanggy on 2017/10/26.
 */
public class PlatformWindows extends AbstractPlatform{
    public PlatformWindows(AbstractMonkey monkey) {
        this.monkey = monkey;
    }

    @Override
    public void program() {
        monkey.type();
        System.out.println("使用windows平台！\n");
    }
}
