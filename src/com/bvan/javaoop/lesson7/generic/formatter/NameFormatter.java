package com.bvan.javaoop.lesson7.generic.formatter;

/**
 * @author bvanchuhov
 */
public class NameFormatter implements Formatter<Product> {

    @Override
    public String format(Product product) {
        return product.getName();
    }
}
