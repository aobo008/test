package com.test.design_pattern.action.interpreter;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Variable  implements Expression {
    @Override
    public int interpret(Context context) {
        return context.LookupValue(this);
    }
}
