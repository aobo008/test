package com.test.design_pattern.structure.adapter;

/**
 * Created by wanggy on 2017/10/26.
 */
public class AdapterTarget extends Target {
    private Bird bird;

    public AdapterTarget(Bird target) {
        bird = target;
    }

    public void Fly() {
        bird.useWingsFly();
    }
}
