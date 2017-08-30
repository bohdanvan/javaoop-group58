package com.bvan.javaoop.lessons11_12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class BarWithExecutorService {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int drinkerId = 0; drinkerId < 3; drinkerId++) {
            Runnable runnable = new Drinker();
            executor.submit(runnable);
        }
        executor.submit(new Drinker());

        executor.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
