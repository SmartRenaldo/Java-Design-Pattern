package com.x.pattern.adapter.object_adapter;

/**
 * 适配者接口
 * @author Gavin
 */
public interface TFCard {
    /**
     * 从TF卡中读取数据
     * @return
     */
    String readTF();

    /**
     * 往TF卡中写数据
     */
    void writeTF(String msg);
}
