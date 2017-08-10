package com.bvan.javaoop.lesson7.generic.formatter;

/**
 * @author bvanchuhov
 */
public interface Formatter<T> {

    String format(T value);
}
