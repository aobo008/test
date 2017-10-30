package com.test.design_pattern.action.strategy;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {

        this.strategy = strategy;
    }

    public void programLanguage() {

        strategy.programLanguage();
    }
}
