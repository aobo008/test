package com.test.design_pattern.action.responsibilityChain;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteHandlerPM extends Handler {
    @Override
    String handleRequest(int type, String user) {
        String ret = "";

        if (Type.PUBLISH_APP == type) {
            ret = user + "’s App can be publish!";
        }
        else {
            if (getmHandler() != null) {
                System.out.println("*********** ConcreteHandlerPM **************");
                ret = getmHandler().handleRequest(type, user);
            }
        }

        return ret;
    }
}
