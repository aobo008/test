package com.test.design_pattern.action.strategy;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteStrategyWeb  implements Strategy {
    @Override
    public void programLanguage() {
        System.out.println("Use Web to Program this App!");
    }
}
