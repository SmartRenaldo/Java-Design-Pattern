package com.x.pattern.builder.demo2;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("金士顿内存条")
                .mainBoard("华硕")
                .build();

        System.out.println(phone);
    }
}
