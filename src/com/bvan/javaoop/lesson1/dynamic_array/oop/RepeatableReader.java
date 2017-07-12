package com.bvan.javaoop.lesson1.dynamic_array.oop;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RepeatableReader {

    private final Scanner scanner;

    public RepeatableReader(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    public int readInt(String message, String errorMessage) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println(errorMessage);
            System.out.print(message);
        }
        return scanner.nextInt();
    }

    public int readInt() {
        return readInt(">> ", "Illegal input");
    }
}
