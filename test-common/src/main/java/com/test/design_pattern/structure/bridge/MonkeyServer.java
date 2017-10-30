package com.test.design_pattern.structure.bridge;

/**
 * Created by wanggy on 2017/10/26.
 */
public class MonkeyServer extends AbstractMonkey {
    @Override
    public void type() {
        System.out.print("服务器工程师,");
    }
}
