package com.bvan.javaoop.lesson8.array_list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 110; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
