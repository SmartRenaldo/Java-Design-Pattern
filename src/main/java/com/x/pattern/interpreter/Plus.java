package com.x.pattern.interpreter;

public class Plus extends AbstractExpression {
    /**
     * left and right hand sides parts of '+'
     */
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * calculate 'left + right'
     *
     * @param context
     * @return
     */
    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "+" + right.toString() + ")";
    }
}
