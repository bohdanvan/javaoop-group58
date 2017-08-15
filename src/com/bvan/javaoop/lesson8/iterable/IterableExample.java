package com.bvan.javaoop.lesson8.iterable;

import com.bvan.javaoop.common.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IterableExample {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("MacBook", 2500));
        products.add(new Product("Lenovo", 1700));

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }

//        for (Product product : products) {
//            System.out.println(product);
//        }
    }
}
