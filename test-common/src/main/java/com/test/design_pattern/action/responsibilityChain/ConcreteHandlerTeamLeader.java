package com.test.design_pattern.action.responsibilityChain;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteHandlerTeamLeader  extends Handler {
    @Override
    String handleRequest(int type, String user) {
        String ret = "";

        if (Type.CODE_FORMAT == type) {
            ret = user + "’s App code format is Ok!";
        }
        else {
            if (getmHandler() != null) {
                System.out.println("*********** ConcreteHandlerTeamLeader **************");
                ret = getmHandler().handleRequest(type, user);
            }
        }

        return ret;
    }
}