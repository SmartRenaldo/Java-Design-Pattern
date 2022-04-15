package com.x.pattern.bridge;

/**
 * @author Yiqi Li
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        System.out.print("Mac操作系统： ");
        videoFile.decode(filename);
    }
}
