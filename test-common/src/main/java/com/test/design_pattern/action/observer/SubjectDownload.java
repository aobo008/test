package com.test.design_pattern.action.observer;

/**
 * Created by wanggy on 2017/10/27.
 */
public class SubjectDownload extends Subject {
    public void processChange(String state) {

        this.modifyObservers(state);
    }
}
