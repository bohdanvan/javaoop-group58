package com.bvan.javaoop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class Dog {

    private final String name;
    private final int age;

    public Dog(String name, int age) {
        if (age < 0 || age > 13) {
            throw new IllegalArgumentException("illegal age: " + age);
        }

        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Gav-gav, " + name);
    }

    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            bark();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
