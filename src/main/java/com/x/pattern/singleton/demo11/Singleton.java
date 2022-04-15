package com.x.pattern.singleton.demo11;

import java.io.Serializable;

/**
 * 破坏单例模式：
 * <p>
 * 使上面定义的单例类（Singleton）可以创建多个对象，枚举方式除外。有两种方式，分别是序列化和反射。
 * <p>
 * 序列化反序列化
 *
 * @author Gavin
 */
public class Singleton {
    //私有构造方法
    private Singleton() {
    }

    private static volatile Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if (instance != null) {
                return instance;
            }

            instance = new Singleton();
            return instance;
        }
    }
}
