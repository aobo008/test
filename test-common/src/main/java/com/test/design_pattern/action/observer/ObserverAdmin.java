package com.test.design_pattern.action.observer;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ObserverAdmin implements Observer {
    @Override
    public void update(String state) {
        System.out.println("当前机器运行状态是：" + state);
    }
}
