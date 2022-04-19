package com.x.pattern.iterator;

public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("Einstein", "001"));
        aggregate.addStudent(new Student("Newton", "002"));
        aggregate.addStudent(new Student("Robin", "003"));
        aggregate.addStudent(new Student("Ted", "004"));

        StudentIterator iterator = aggregate.getStudentIterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
