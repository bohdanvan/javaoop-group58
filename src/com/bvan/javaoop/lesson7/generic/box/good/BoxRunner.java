package com.bvan.javaoop.lesson7.generic.box.good;

import com.bvan.javaoop.lesson7.generic.box.Cat;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Box<Cat> catBox = new Box<Cat>(cat);

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
