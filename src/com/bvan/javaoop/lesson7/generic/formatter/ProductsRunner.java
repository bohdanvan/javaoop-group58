package com.bvan.javaoop.lesson7.generic.formatter;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Printer<Product> printer = new Printer();
        printer.add(new Product("MacBook", 2000));
        printer.add(new Product("Lenovo", 1500));

        Formatter<Product> nameFormatter = new NameFormatter();
        printer.print(nameFormatter);
        System.out.println();

        CsvFormatter<Product> csvFormatter = new CsvFormatter<>(";");
        printer.print(csvFormatter);
        System.out.println();
    }
}
