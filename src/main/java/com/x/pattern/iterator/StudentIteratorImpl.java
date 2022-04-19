package com.x.pattern.iterator;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    //record location during traverse
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position++;

        return student;
    }
}
