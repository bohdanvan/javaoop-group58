package com.bvan.javaoop.common;

import java.util.Objects;

/**
 * Immutable person.
 *
 * @author bvanchuhov
 */
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 0);
    }

    public String sayHello() {
        return "Hello, I'm " + name
                + ", " + age + " years old";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person changeName(String name) {
        return new Person(name, this.age);
    }

    public Person changeAge(int age) {
        return new Person(this.name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age: " + age);
        }
    }

    private boolean isAge(int age) {
        return age >= 0 && age <= 120;
    }
}
