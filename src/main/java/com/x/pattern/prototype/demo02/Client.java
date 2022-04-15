package com.x.pattern.prototype.demo02;

/**
 * 浅克隆
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student student = new Student("张三");
        citation.setStudent(student);

        Citation clone = citation.clone();
        clone.getStudent().setName("李四");

        citation.show();
        clone.show();
    }
}
