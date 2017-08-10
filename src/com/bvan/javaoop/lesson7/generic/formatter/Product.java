package com.bvan.javaoop.lesson7.generic.formatter;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Product implements Formattable {

    private final String name;
    private final long price;

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public List<String> getFields() {
        return Arrays.asList(
                name,
                Long.toString(price)
        );
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
