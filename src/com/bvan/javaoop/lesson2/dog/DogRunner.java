package com.bvan.javaoop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 3);

        Owner taras = new Owner("Taras", rex);
        taras.giveCommand();
    }
}
