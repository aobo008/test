package com.test.design_pattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanggy on 2017/10/27.
 */
public abstract class Subject {
    private List<IObserver> list = new ArrayList<IObserver>();

    public void attach(IObserver observer){

        list.add(observer);
    }

    public void detach(IObserver observer){

        list.remove(observer);
    }

    public void modifyObservers(String newState){
        for (IObserver observer:list){
            observer.update(newState);
        }
    }
}
