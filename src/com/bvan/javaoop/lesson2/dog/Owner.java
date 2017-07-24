package com.bvan.javaoop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class Owner {

    private final String name;
    private final Dog dog;

    public Owner(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public void giveCommand() {
        dog.bark(5);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
