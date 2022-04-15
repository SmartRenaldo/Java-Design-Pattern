package com.x.pattern.bridge;

/**
 * @author Yiqi Li
 */
public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String filename);
}
