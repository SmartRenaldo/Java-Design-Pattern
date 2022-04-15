package com.x.pattern.singleton.demo04;

/**
 * 懒汉式-方式2（线程安全）
 *
 * 该方式也实现了懒加载效果，同时又解决了线程安全问题。
 * 但是在getInstance()方法上添加了synchronized关键字，导致该方法的执行效果特别低。
 * 从上面代码我们可以看出，其实就是在初始化instance的时候才会出现线程安全问题，一旦初始化完成就不存在了。
 *
 * @author Gavin
 */
public class Singleton {
    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        // 判断instance是否为null，如果为null，说明还没有创建Singleton类的对象
        // 如果没有，创建一个并返回，如果有，直接返回
        if (instance == null) {
            // 线程1等待，线程2获取到cpu的执行权，也会进入到该判断里面
            instance = new Singleton();
        }

        return instance;
    }

    private Singleton() {
    }
}
