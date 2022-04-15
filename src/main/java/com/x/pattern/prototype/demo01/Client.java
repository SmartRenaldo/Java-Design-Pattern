package com.x.pattern.prototype.demo01;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();

        System.out.println("原型对象和克隆出来的是否是同一个对象？" + (realizeType == clone));
    }
}
