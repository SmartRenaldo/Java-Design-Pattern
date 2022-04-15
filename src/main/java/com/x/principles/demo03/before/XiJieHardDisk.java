package com.x.principles.demo03.before;

public class XiJieHardDisk {
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    public String get() {
        System.out.println("使用希捷硬盘读取数据");
        return "数据";
    }
}
