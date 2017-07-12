package com.bvan.javaoop.lesson1.dynamic_array.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private static final int DEFAULT_INIT_CAPACITY = 8;
    private static final double DEFAULT_GROW_FACTOR = 1.5;

    private int[] elems;
    private int size = 0;
    private final double growFactor;

    public DynamicArray(int initCapacity, double growFactor) {
        this.elems = new int[initCapacity];
        this.growFactor = growFactor;
    }

    public DynamicArray(int initSize) {
        this(initSize, DEFAULT_GROW_FACTOR);
    }

    public DynamicArray() {
        this(DEFAULT_INIT_CAPACITY);
    }

    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int) (elems.length * growFactor);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            int elem = elems[i];
            joiner.add(String.valueOf(elem));
        }
        return joiner.toString();
    }
}
