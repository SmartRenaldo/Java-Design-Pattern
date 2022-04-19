package com.x.pattern.iterator;

public interface StudentIterator {
    /**
     * judge if there is next student
     * @return
     */
    boolean hasNext();

    /**
     * get next student
     * @return
     */
    Student next();
}
