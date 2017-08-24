package com.bvan.javaoop.lesson11.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadUtils {

    private ThreadUtils() {}

    public static void println(Object o) {
        Thread thread = Thread.currentThread();
        System.out.println(thread + ": " + o);
    }
}
