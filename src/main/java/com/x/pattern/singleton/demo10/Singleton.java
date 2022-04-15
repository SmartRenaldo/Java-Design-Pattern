package com.x.pattern.singleton.demo10;

import java.io.Serializable;

/**
 * 序列化、反序列方式破坏单例模式的解决方法
 * 在Singleton类中添加readResolve()方法，在反序列化时被反射调用，如果定义了这个方法，就返回这个方法的值，
 * 如果没有定义，则返回新new出来的对象。
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

    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
