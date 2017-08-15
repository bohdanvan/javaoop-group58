package com.bvan.javaoop.lesson8.banchmark.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.bvan.javaoop.lesson8.banchmark.oop.BenchmarkUtil.printNanoTime;

/**
 * @author bvanchuhov
 */
public class ArrayListVsLinkedListOOPBenchmark {

    private static final int ELEMS_QUANTITY = 1_000_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(ELEMS_QUANTITY);
        addElems(arrayList, ELEMS_QUANTITY, null);

        List<Integer> linkedList = new LinkedList<>(arrayList);

//        int getPos = ELEMS_QUANTITY / 2;
//        System.out.println("Time of get():");
//        printNanoTime("ArrayList:", () -> arrayList.get(getPos));
//        printNanoTime("LinkedList:", () -> linkedList.get(getPos));
//        System.out.println();

        int addPos = ELEMS_QUANTITY/2;
        System.out.println("Time of add():");
        printNanoTime("ArrayList:", () -> arrayList.add(addPos, null));
        printNanoTime("LinkedList:", () -> linkedList.add(addPos, null));
    }

    private static <T> void addElems(List<T> list, int elemsQuantity, T elem) {
        for (int i = 0; i < elemsQuantity; i++) {
            list.add(elem);
        }
    }
}
