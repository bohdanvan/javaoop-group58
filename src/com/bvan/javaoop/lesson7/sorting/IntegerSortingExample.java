package com.bvan.javaoop.lesson7.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IntegerSortingExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 7, 1);
        System.out.println("original: " + list);

        Collections.sort(list);
        System.out.println("sorted: " + list);
    }
}
