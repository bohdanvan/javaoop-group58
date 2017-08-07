package com.bvan.javaoop.lesson5;

/**
 * @author bvanchuhov
 */
public class SumWithVararg {

    public static void main(String[] args) {
        int sum = sum(10, 40, 50, 80, 90);
        System.out.println(sum);
    }

    public static int sum(int... elems) {
        int sum = 0;
        for (int elem : elems) {
            sum += elem;
        }
        return sum;
    }
}
