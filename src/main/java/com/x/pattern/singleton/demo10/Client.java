package com.x.pattern.singleton.demo10;

import java.io.*;

/**
 * @author Gavin
 */
public class Client {
    private static final String ADDRESS = "src/main/java/com/x/pattern/singleton/demo09/obj.txt";

    public static void main(String[] args) {
        writeObj2File();
        Singleton instance1 = readObjFromFile();
        Singleton instance2 = readObjFromFile();

        System.out.println("instance1 == instance2: " + (instance1 == instance2));
    }

    public static void writeObj2File() {
        Singleton instance = Singleton.getInstance();

        //创建对象输出流
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ADDRESS))
        ) {
            //将instance对象写出到文件中
            oos.writeObject(instance);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Singleton readObjFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ADDRESS))
        ) {
            return (Singleton) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
