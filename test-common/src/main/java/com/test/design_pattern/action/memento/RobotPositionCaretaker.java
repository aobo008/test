package com.test.design_pattern.action.memento;

/**
 * Created by wanggy on 2017/10/27.
 */
public class RobotPositionCaretaker {
    private  RobotPositionMemento memento;

    public RobotPositionMemento getMemento() {

        return memento;
    }

    public void setMemento(RobotPositionMemento memento) {

        this.memento = memento;
    }
}
