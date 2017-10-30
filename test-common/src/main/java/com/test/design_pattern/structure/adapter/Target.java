package com.test.design_pattern.structure.adapter;

/**
 * Created by wanggy on 2017/10/26.
 */
public class Target {
    public void Fly() {
        //这个愿望，基本有子类实现（适配类）
        System.out.println("我想飞");
    }
}
