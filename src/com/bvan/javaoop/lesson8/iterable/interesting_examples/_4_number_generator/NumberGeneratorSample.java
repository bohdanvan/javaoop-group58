package com.bvan.javaoop.lesson8.iterable.interesting_examples._4_number_generator;

/**
 * @author Bohdan Vanchuhov
 */
public class NumberGeneratorSample {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator(10, 100);
        for (Integer elem : generator) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
