package com.test.design_pattern.action.memento;

/**
 * Created by wanggy on 2017/10/27.
 */
public class RobotPositionMemento {
    private String mRobotName;
    private int mCurXPos;
    private int mCurYpos;

    public RobotPositionMemento(String mRobotName, int mCurXPos, int mCurYpos) {
        this.mRobotName = mRobotName;
        this.mCurXPos = mCurXPos;
        this.mCurYpos = mCurYpos;
    }

    public String getmRobotName() {

        return mRobotName;
    }

    public int getmCurXPos() {

        return mCurXPos;
    }

    public int getmCurYpos() {

        return mCurYpos;
    }
}
