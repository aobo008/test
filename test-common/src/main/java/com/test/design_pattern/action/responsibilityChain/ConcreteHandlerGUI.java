package com.test.design_pattern.action.responsibilityChain;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteHandlerGUI extends Handler{
    @Override
    String handleRequest(int type, String user) {
        String ret = "";

        if (Type.UI_EFFECT == type) {
            ret = user + "’s App UI is Ok!";
        }
        else {
            if (getmHandler() != null) {
                System.out.println("*********** ConcreteHandlerGUI **************");
                ret = getmHandler().handleRequest(type, user);
            }
        }

        return ret;
    }
}
