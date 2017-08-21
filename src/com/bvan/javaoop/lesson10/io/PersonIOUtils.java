package com.bvan.javaoop.lesson10.io;

import com.bvan.javaoop.common.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class PersonIOUtils {

    private PersonIOUtils() {}

    // Text Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<Person> readPeopleFromFile(String fileName) throws IOException {
        // try-with-resources (Java 7)
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readPeople(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static Person readPersonFromFile(String fileName) throws IOException {
        BufferedReader reader = null; // < Java 7
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return readPerson(reader);
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static List<Person> readPeople(BufferedReader reader) throws IOException {
        List<Person> people = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Person person = parsePerson(line);
            people.add(person);
        }

        return people;
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Person readPerson(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parsePerson(line);
    }

    // Text Output

    /**
     * @throws IOException
     */
    public static void writePeopleIntoFile(String fileName, List<Person> people) throws IOException {
        try (Writer writer = new BufferedWriter(new FileWriter(fileName, true))) {
            for (Person person : people) {
                String s = formatPerson(person);
                writer.write(s + "\n");
            }
        }
    }

    private static String formatPerson(Person person) {
        return person.getName() + "|" + person.getAge();
    }

    // Binary Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<Person> readPeopleFromBinFile(String fileName) throws IOException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Person>)inputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new IllegalFormatException("illegal bin file", e);
        }
    }

    // Binary Output

    /**
     * @throws IOException
     */
    public static void writePeopleIntoBinFile(String fileName, List<Person> people) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(people);
        }
    }

    // Parsing

    /**
     * @throws IllegalFormatException
     */
    private static Person parsePerson(String s) {
        String[] tokens = s.split(",");
        if (tokens.length < 2) {
            throw new IllegalFormatException("should be 2 values: " + s);
        }

        String name = tokens[0];
        if (!isInt(tokens[1])) {
            throw new IllegalFormatException("illegal int: " + tokens[1]);
        }
        int age = Integer.parseInt(tokens[1]);
        if (!isAge(age)) {
            throw new IllegalFormatException("illegal age: " + age);
        }

        return new Person(name, age);
    }

    private static boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
