package com.bvan.javaoop.lessons11_12.multithreading;

import java.util.concurrent.TimeUnit;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId = 0;
    private final int id = nextId++;

    @Override
    public void run() {
        ThreadUtils.println(drinkerInfo() + "Hello");
        for (int beer = 0; beer < 3; beer++) {
            ThreadUtils.println(drinkerInfo() + "I'm drinking " + beer + " beer");

            sleep(TimeUnit.SECONDS.toMillis(1));
        }
        ThreadUtils.println(drinkerInfo() + "I'm ready");
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String drinkerInfo() {
        return "I'm " + id + " drinker. ";
    }
}
