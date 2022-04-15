package com.x.pattern.factory.JDKexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Gavin
 */
public class CollectionIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");

        // 获取迭代器对象
        Iterator<String> iterator = list.iterator();

        // 使用迭代器遍历
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
