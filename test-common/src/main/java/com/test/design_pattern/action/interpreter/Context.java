package com.test.design_pattern.action.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Context {
    private Map valueMap = new HashMap<>();

    public void addValue(Variable x, int y) {
        valueMap.put(x, y);
    }

    public int LookupValue(Variable x) {
        return (int) valueMap.get(x);
    }
}