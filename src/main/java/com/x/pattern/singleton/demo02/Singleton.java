package com.x.pattern.singleton.demo02;

/**
 * 饿汉式 ： 静态代码块
 * @author Gavin
 */
public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
