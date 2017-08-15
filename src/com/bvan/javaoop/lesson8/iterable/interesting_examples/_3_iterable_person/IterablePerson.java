package com.bvan.javaoop.lesson8.iterable.interesting_examples._3_iterable_person;

import java.util.Iterator;

/**
 * @author Bohdan Vanchuhov
 */
public class IterablePerson implements Iterable<Character> {

    private final String name;
    private final int age;

    public IterablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Iterator<Character> iterator() {
        return new NameIterator();
    }

    @Override
    public String toString() {
        return "IterablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private class NameIterator implements Iterator<Character> {
        private int currentCharIndex = 0;

        @Override
        public boolean hasNext() {
            return currentCharIndex < name.length();
        }

        @Override
        public Character next() {
            return name.charAt(currentCharIndex++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
