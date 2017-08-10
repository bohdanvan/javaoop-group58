package com.bvan.javaoop.lesson7.generic.formatter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Printer<T> {

    private final List<T> values = new LinkedList<>();

    public void add(T product) {
        values.add(product);
    }

    public void print(Formatter<T> formatter) {
        for (T value : values) {
            String s = formatter.format(value);
            System.out.println(s);
        }
    }
}
