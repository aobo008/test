package com.test.design_pattern.action.interpreter;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Sub implements Expression {
    private Expression left, right;

    public Sub(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
