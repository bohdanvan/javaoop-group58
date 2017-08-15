package com.bvan.javaoop.lesson8.iterable.interesting_examples._2_modification_sample;

import com.bvan.javaoop.common.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Bohdan Vanchuhov
 */
public class ModificationSample {

    public static void main(String[] args) {
        List<Person> persons = new CopyOnWriteArrayList<>(Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30)
        ));
        System.out.println(persons);

        Iterator<Person> iterator = persons.iterator();
        persons.remove(0);

        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }

        System.out.println(persons);
    }
}
