package com.x.pattern.singleton.demo13;

import java.io.IOException;
import java.io.InputStream;

/**
 * JDK源码解析-Runtime类
 * Runtime类就是使用的单例设计模式。
 * @author Gavin
 */
public class RunTimeDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        try {
            Process process = runtime.exec("ipconfig");
            InputStream is = process.getInputStream();
            byte[] arr = new byte[1024 * 1024 * 100];
            int len = is.read(arr);

            System.out.println(new String(arr, 0, len, "GBK"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
