package com.bvan.javaoop.lesson7.wrappers;

/**
 * @author bvanchuhov
 */
public class NullWrapperSample {

    public static void main(String[] args) {
        Integer x = null;
        x++; // x = Integer.valueOf(x.intValue() + 1)
        System.out.println(x);
    }
}
