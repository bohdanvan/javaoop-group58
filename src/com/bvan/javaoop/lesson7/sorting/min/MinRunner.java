package com.bvan.javaoop.lesson7.sorting.min;
import com.bvan.javaoop.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.reverseOrder;

/**
 * @author bvanchuhov
 */
public class MinRunner {

    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(30, 20, 45);
        List<String> names = Arrays.asList("John", "Bob", "Phil");
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Phil", 20)
        );

        System.out.println(Min.min(ages)); // 20
        System.out.println(Min.min(names)); // "Bob"
        System.out.println(Min.min(people, new AgeComparator()));

        System.out.println(Min.min(people, reverseOrder(new AgeComparator())));

        System.out.println(Min.min(people, byName()));

        Collections.sort(people, byName());
        System.out.println(people);
    }

    private static Comparator<Person> byName() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    private static Comparator<Person> byAge() {
        return new AgeComparator();
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}

class NameAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int cmp = o1.getName().compareTo(o2.getName());
        if (cmp != 0) {
            return cmp;
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
