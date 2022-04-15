package com.x.pattern.adapter.class_adapter;

/**
 * @author Yiqi Li
 */
public class Computer {
    /**
     * 从SD卡中读取数据
     */
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is null");
        }

        return sdCard.readSD();
    }
}
