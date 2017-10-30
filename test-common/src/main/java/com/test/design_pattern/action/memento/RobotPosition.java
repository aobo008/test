package com.test.design_pattern.action.memento;

/**
 * Created by wanggy on 2017/10/27.
 */
public class RobotPosition {
    private String mRobotName;
    private int mCurXPos;
    private int mCurYpos;

    public RobotPosition(String mRobotName, int mCurXPos, int mCurYpos) {
        this.mRobotName = mRobotName;
        this.mCurXPos = mCurXPos;
        this.mCurYpos = mCurYpos;
    }

    public void setPos(int mCurXPos, int mCurYpos) {
        this.mCurXPos = mCurXPos;
        this.mCurYpos = mCurYpos;
    }

    public void drawScreen() {

        System.out.println("#RobotPosition#"+mRobotName+": "+mCurXPos+", "+mCurYpos);
    }

    public RobotPositionMemento save() {

        return new RobotPositionMemento(mRobotName, mCurXPos, mCurYpos);
    }

    public void restore(RobotPositionMemento memento) {
        this.mRobotName = memento.getmRobotName();
        this.mCurXPos = memento.getmCurXPos();
        this.mCurYpos = memento.getmCurYpos();
    }
}
