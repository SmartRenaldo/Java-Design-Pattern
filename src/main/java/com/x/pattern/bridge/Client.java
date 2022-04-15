package com.x.pattern.bridge;

/**
 * Bridge is a structural design pattern that divides business logic or huge class
 * into separate class hierarchies that can be developed independently.
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        VideoFile file = new RmvbFile();
        OperatingSystem os = new Mac(file);
        os.play("Matrix");
    }
}
