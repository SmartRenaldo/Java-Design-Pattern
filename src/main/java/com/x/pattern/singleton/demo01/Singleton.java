package com.x.pattern.singleton.demo01;

/**
 * 饿汉式-方式1（静态变量方式）
 * @author Gavin
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
