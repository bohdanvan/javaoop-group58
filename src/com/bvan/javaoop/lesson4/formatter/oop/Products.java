package com.bvan.javaoop.lesson4.formatter.oop;

import com.bvan.javaoop.lesson4.formatter.Product;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Products {

    private final List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(Formatter formatter) {
        for (Product product : products) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
