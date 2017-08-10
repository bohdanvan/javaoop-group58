package com.bvan.javaoop.lesson7.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ComplexSortingExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "John",
                "Bob",
                "Phil",
                "Mike",
                "Kostya",
                "Sasha",
                "Evlampiy"
        );
        System.out.println("original: " + names);

        Collections.sort(names);
        System.out.println("alphabetical order: " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("alphabetical order, desc: " + names);

        Collections.sort(names, byLength());
        System.out.println("length order: " + names);

        Collections.sort(names, Collections.reverseOrder(byLength()));
        System.out.println("length order, desc: " + names);
    }

    private static Comparator<String> byLength() {
        return new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        };
    }
}

