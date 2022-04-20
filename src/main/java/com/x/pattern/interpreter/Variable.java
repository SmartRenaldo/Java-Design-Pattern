package com.x.pattern.interpreter;

/**
 * 变量类
 */
public class Variable extends AbstractExpression {
    /**
     * store variable name
     */
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
