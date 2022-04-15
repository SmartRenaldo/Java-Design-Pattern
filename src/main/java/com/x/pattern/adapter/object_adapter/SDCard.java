package com.x.pattern.adapter.object_adapter;

/**
 * 目标接口
 * @author Gavin
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
