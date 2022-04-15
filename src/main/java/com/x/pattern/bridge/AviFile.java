package com.x.pattern.bridge;

/**
 * @author Yiqi Li
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String filename) {
        System.out.println("Avi视频文件：" + filename);
    }
}
