package com.bvan.javaoop.lesson7.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ExampleWithoutGenerics {

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add(10);
        names.add("Java");

        Object o = names.get(1);
    }
}

