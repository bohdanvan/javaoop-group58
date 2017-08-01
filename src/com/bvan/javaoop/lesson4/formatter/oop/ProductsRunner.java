package com.bvan.javaoop.lesson4.formatter.oop;

import com.bvan.javaoop.lesson3.shape.Shape;
import com.bvan.javaoop.lesson4.formatter.Product;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));

        products.print(new NameFormatter());
        System.out.println();

        products.print(new CsvFormatter(";"));
        System.out.println();

        products.print(priceFormatter());
        System.out.println();
    }

    private static Formatter toStringFormatter() {
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }

    private static Formatter priceFormatter() {
        return product -> String.valueOf(product.getPrice());
    }
}
