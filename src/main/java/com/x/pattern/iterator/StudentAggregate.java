package com.x.pattern.iterator;

/**
 * abstract aggregate class
 */
public interface StudentAggregate {
    /**
     * add student
     */
    void addStudent(Student student);

    /**
     * remove student
     */
    void removeStudent(Student student);

    /**
     * get iterator
     */
    StudentIterator getStudentIterator();
}
