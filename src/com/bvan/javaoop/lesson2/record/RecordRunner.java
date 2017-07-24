package com.bvan.javaoop.lesson2.record;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class RecordRunner {

    public static void main(String[] args) {
        Record record = new Record("Java");
        System.out.println(record.getDate());

        Date date = record.getDate();
        date.setTime(0);

        System.out.println(record.getDate());
    }
}
