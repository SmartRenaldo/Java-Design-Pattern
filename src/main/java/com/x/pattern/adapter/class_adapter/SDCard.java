package com.x.pattern.adapter.class_adapter;

/**
 * 目标接口
 * @author Yiqi Li
 */
public interface SDCard {
    /**
     * 从SD卡中读取数据
     * @return
     */
    String readSD();

    /**
     * 往SD卡中写数据
     */
    void writeSD(String msg);
}
