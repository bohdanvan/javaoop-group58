package com.bvan.javaoop.lesson7.generic.box.bad;

import com.bvan.javaoop.lesson7.generic.box.Cat;
import com.bvan.javaoop.lesson7.generic.box.Dog;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        ObjectBox catBox = new ObjectBox(new Dog());

        sendBox(catBox);
    }

    private static void sendBox(ObjectBox catBox) {
        Object value = catBox.get();
        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meow();
        } else {
            throw new IllegalArgumentException("where is my cat?");
        }
    }
}
