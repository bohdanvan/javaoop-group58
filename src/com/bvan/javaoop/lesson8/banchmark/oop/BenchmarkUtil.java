package com.bvan.javaoop.lesson8.banchmark.oop;

/**
 * @author bvanchuhov
 */
public final class BenchmarkUtil {

    private static final String OUTPUT_TEMPLATE = "%-25s:\t%12s\n";

    private BenchmarkUtil() {}

    public static long milliTime(Task task) {
        long start = System.currentTimeMillis();

        task.execute();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long nanoTime(Task task) {
        long start = System.nanoTime();

        task.execute();

        long finish = System.nanoTime();
        return finish - start;
    }

    public static void printMilliTime(String message, Task task) {
        System.out.printf(OUTPUT_TEMPLATE,
                message,
                Long.toString(milliTime(task)));
    }

    public static void printNanoTime(String message, Task task) {
        System.out.printf(OUTPUT_TEMPLATE,
                message,
                Long.toString(nanoTime(task)));
    }
}
