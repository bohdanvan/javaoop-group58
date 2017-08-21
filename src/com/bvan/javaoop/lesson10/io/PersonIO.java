package com.bvan.javaoop.lesson10.io;

import com.bvan.javaoop.common.Person;

import java.io.IOException;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class PersonIO {

    public static void main(String[] args) {
        String inTextFileName = "files/people.csv";
        String outTextFileName = "files/people-out.txt";
        String binFileName = "files/people.dat";

        testTextIO(inTextFileName, outTextFileName);
        testSerialize(inTextFileName, binFileName);
        testDeserialize(binFileName);
    }

    private static void testTextIO(String inTextFileName, String outTextFileName) {
        try {
            List<Person> people = PersonIOUtils.readPeopleFromFile(inTextFileName);
            PersonIOUtils.writePeopleIntoFile(outTextFileName, people);
            System.out.println("DONE");
        } catch (IOException e) {
            System.out.println("Sorry, IO Error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, illegal format: " + e.getMessage());
        }
    }

    private static void testSerialize(String inTextFileName, String binFileName) {
        try {
            List<Person> people = PersonIOUtils.readPeopleFromFile(inTextFileName);
            PersonIOUtils.writePeopleIntoBinFile(binFileName, people);
            System.out.println("DONE");
        } catch (IOException e) {
            System.out.println("Sorry, IO Error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, illegal format: " + e.getMessage());
        }
    }

    private static void testDeserialize(String binFileName) {
        try {
            List<Person> people = PersonIOUtils.readPeopleFromBinFile(binFileName);
            for (Person person : people) {
                System.out.println(person);
            }
        } catch (IOException e) {
            System.out.println("Sorry, IO Error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, illegal format: " + e.getMessage());
        }
    }
}
