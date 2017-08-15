package com.bvan.javaoop.lesson8.iterable.interesting_examples._3_iterable_person;

/**
 * @author Bohdan Vanchuhov
 */
public class IterablePersonRunner {

    public static void main(String[] args) {
        IterablePerson person = new IterablePerson("John", 25);
        for (Character c : person) {
            System.out.println(c);
        }
    }
}
