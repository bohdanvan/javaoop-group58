package com.bvan.javaoop.lesson7.sorting;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Long.compare(30L, 20L)); // > 0

        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("Homework".compareTo("Hometown")); // > 0
        System.out.println("Homework".compareTo("Home")); // > 0

        Integer x = 10;
        Integer y = 20;
        System.out.println(x.compareTo(y)); // < 0
    }
}
