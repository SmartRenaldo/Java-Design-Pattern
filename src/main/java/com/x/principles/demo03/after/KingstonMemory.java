package com.x.principles.demo03.after;

public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("使用金士顿作内存条");
    }
}
