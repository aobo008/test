package com.test.design_pattern.action.interpreter;

/**
 * Created by wanggy on 2017/10/27.
 */
public final class Constant implements IExpression {
    private int i;

    public Constant(int i) {

        this.i = i;
    }

    @Override
    public int interpret(Context context) {

        return i;
    }
}
