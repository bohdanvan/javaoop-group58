package com.bvan.javaoop.lesson5.enum_example.formatter;

import com.bvan.javaoop.common.Product;

/**
 * @author bvanchuhov
 */
public class ProductRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("iPhone", 1500));
        products.add(new Product("Lenovo Notebook", 1000));

        products.print(FormatterType.PRICE);
        System.out.println();
        products.print(FormatterType.CSV);
        System.out.println();
        products.print(FormatterType.TO_STRING);
    }
}
