package com.test.design_pattern.action.observer;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ObserverClient {
    public static void main(String[] args){
        SubjectDownload subject = new SubjectDownload();
        Observer observer = new ObserverAdmin();

        subject.attach(observer);
        subject.processChange("start");
        subject.processChange("pause");
        subject.processChange("stop");
    }
}
