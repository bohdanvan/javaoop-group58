package com.bvan.javaoop.lesson7.wrappers;

/**
 * @author bvanchuhov
 */
public class IntegerSample {

    public static void main(String[] args) {
        Integer x = 10; // int -> Integer: Integer.valueOf(10)
        Integer y = 20; // Integer.valueOf(20)
        Integer z = x + y; // Integer.valueOf(x.intValue() + y.intValue())

        System.out.println("z = " + z);
    }
}
