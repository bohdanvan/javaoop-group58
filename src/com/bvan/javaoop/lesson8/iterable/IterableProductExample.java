package com.bvan.javaoop.lesson8.iterable;

import com.bvan.javaoop.common.Product;

/**
 * @author bvanchuhov
 */
public class IterableProductExample {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("MacBook", 2500));
        products.add(new Product("Lenovo", 1700));

        for (Product product: products) {
            System.out.println(product);
        }
    }
}
