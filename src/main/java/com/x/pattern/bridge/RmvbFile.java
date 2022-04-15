package com.x.pattern.bridge;

/**
 * @author Yiqi Li
 */
public class RmvbFile implements VideoFile {
    @Override
    public void decode(String filename) {
        System.out.println("Rmvb视频文件：" + filename);
    }
}
