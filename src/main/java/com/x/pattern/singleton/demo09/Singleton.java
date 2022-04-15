package com.x.pattern.singleton.demo09;

import java.io.Serializable;

/**
 * 破坏单例模式：
 *
 * 使上面定义的单例类（Singleton）可以创建多个对象，枚举方式除外。有两种方式，分别是序列化和反射。
 *
 * 序列化反序列化
 *
 * @author Gavin
 */
public class Singleton implements Serializable {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return  SingletonHolder.INSTANCE;
    }
}
