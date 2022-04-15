package com.x.pattern.adapter.object_adapter;

/**
 * @author Gavin
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read msg : hello world TF";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
