package com.x.pattern.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.assign(a, 1);
        context.assign(b, 3);
        context.assign(c, 5);
        context.assign(d, 9);

        AbstractExpression expression = new Minus(a, new Plus(new Minus(b, c), d));

        System.out.println(expression + " = " + expression.interpret(context));
    }
}
