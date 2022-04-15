package com.x.pattern.adapter.class_adapter;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.readSD(new SDCardImpl()));

        // 展示适配器的作用
        System.out.println("============");

        //使用该电脑读取TF卡中的数据
        //定义适配器类
        System.out.println(computer.readSD(new SDAdapterTF()));
    }
}
