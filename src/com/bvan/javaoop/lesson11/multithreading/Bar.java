package com.bvan.javaoop.lesson11.multithreading;

/**
 * @author bvanchuhov
 */
public class Bar {

    public static void main(String[] args) {
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();

        ThreadUtils.println("Bar is closed");
    }
}

