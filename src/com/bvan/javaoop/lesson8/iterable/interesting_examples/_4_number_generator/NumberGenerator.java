package com.bvan.javaoop.lesson8.iterable.interesting_examples._4_number_generator;

import java.util.Iterator;

/**
 * @author Bohdan Vanchuhov
 */
public class NumberGenerator implements Iterable<Integer> {

    private int min;
    private int max;

    public NumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumberGeneratorIterator();
    }

    private class NumberGeneratorIterator implements Iterator<Integer> {
        private int current = min;

        @Override
        public boolean hasNext() {
            return current <= max;
        }

        @Override
        public Integer next() {
            return current++;
        }
    }
}
