package com.bvan.javaoop.lesson8.iterable.interesting_examples;

import com.bvan.javaoop.common.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class BossSample {
    public static void main(String[] args) {
        List<Person> employees = new ArrayList<>();
        employees.add(new Person("John", 25));
        employees.add(new Person("Bob", 30));

        Iterator<Person> teamLead = employees.iterator();
        while (teamLead.hasNext()) {
            Person employee = teamLead.next();

            if (employee.getName().equals("Bob")) {
                teamLead.remove();
            }
        }

        for (Person employee : employees) {
            System.out.println(employee);
        }

        System.out.println(employees);
    }
}
