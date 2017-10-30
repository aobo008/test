package com.test.design_pattern.action.responsibilityChain;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteHandlerTestEngineer extends Handler {
    @Override
    String handleRequest(int type, String user) {
        String ret = "";

        if (Type.TEST_PROJECT == type) {
            ret = user + "’s App test is Ok!";
        }
        else {
            if (getmHandler() != null) {
                System.out.println("*********** ConcreteHandlerTestEngineer **************");
                ret = getmHandler().handleRequest(type, user);
            }
        }

        return ret;
    }
}