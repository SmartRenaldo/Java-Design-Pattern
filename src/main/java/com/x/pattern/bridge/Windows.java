package com.x.pattern.bridge;

/**
 * @author Yiqi Li
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        System.out.print("Windows操作系统: ");
        videoFile.decode(filename);
    }
}
