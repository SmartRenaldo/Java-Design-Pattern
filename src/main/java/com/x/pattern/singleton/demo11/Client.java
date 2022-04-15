package com.x.pattern.singleton.demo11;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 反射破换单例模式
 * @author Gavin
 */
public class Client {
    public static void main(String[] args) {
        Class clazz = Singleton.class;

        try {
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);

            Singleton instance1 = (Singleton) constructor.newInstance();
            Singleton instance2 = (Singleton) constructor.newInstance();

            System.out.println("instance1 == instance2: " + (instance1 == instance2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
