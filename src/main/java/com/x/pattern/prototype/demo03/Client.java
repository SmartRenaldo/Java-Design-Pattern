package com.x.pattern.prototype.demo03;

import java.io.*;

/**
 * 深克隆
 * @author Yiqi Li
 */
public class Client {
    private static final String ADDRESS = "src/main/java/com/x/pattern/prototype/demo03/o.txt";

    public static void main(String[] args) {
        Citation citation = new Citation();
        Student student = new Student("张三");
        citation.setStudent(student);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ADDRESS));
            oos.writeObject(citation);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ADDRESS));
            Citation citation1 = (Citation) ois.readObject();
            ois.close();

            citation1.getStudent().setName("李四");

            citation.show();
            citation1.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
