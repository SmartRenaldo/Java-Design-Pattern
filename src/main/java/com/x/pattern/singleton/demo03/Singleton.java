package com.x.pattern.singleton.demo03;

/**
 * 懒汉式-方式1（线程不安全）
 *
 * 说明：
 * 从上面代码我们可以看出该方式在成员位置声明Singleton类型的静态变量，
 * 并没有进行对象的赋值操作，那么什么时候赋值的呢？
 * 当调用getInstance()方法获取Singleton类的对象的时候才创建Singleton类的对象，
 * 这样就实现了懒加载的效果。但是，如果是多线程环境，会出现线程安全问题。
 *
 * @author Gavin
 */
public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
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
