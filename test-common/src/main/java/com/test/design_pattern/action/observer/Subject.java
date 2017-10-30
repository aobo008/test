package com.test.design_pattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanggy on 2017/10/27.
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    public void attach(Observer observer){
        list.add(observer);
    }

    public void detach(Observer observer){
        list.remove(observer);
    }

    public void modifyObservers(String newState){
        for (Observer observer:list){
            observer.update(newState);
        }
    }
}
