package com.test.design_pattern.action.interpreter;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Mul implements IExpression {
    private IExpression left, right;

    public Mul(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {

        return left.interpret(context) * right.interpret(context);
    }
}
