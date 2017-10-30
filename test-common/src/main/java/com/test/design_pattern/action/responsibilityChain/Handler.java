package com.test.design_pattern.action.responsibilityChain;

/**
 * Created by wanggy on 2017/10/27.
 */
public abstract class Handler {
    private Handler mHandler;

    public Handler getmHandler() {

        return mHandler;
    }

    public void setmHandler(Handler mHandler) {

        this.mHandler = mHandler;
    }

    abstract String handleRequest(int type, String user);
}
