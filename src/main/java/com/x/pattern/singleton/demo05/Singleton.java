package com.x.pattern.singleton.demo05;

/**
 * 懒汉式-方式3（双重检查锁）
 *
 * 再来讨论一下懒汉模式中加锁的问题，对于 getInstance() 方法来说，绝大部分的操作都是读操作，
 * 读操作是线程安全的，所以我们没必让每个线程必须持有锁才能调用该方法，我们需要调整加锁的时机。
 * 由此也产生了一种新的实现模式：双重检查锁模式
 *
 * @author Gavin
 */
public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        //第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    private Singleton() {
    }
}
