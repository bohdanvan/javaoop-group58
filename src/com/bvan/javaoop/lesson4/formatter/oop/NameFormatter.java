package com.bvan.javaoop.lesson4.formatter.oop;

import com.bvan.javaoop.lesson4.formatter.Product;

/**
 * @author bvanchuhov
 */
public class NameFormatter implements Formatter {

    @Override
    public String format(Product product) {
        return product.getName();
    }
}
