package com.bvan.javaoop.lesson2.record;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class DateExample {

    public static void main(String[] args) {
        Date date = new Date(); // millis from 01.01.1970 00:00 (timestamp)
        System.out.println(date);

        Date date2 = date;
        date2.setTime(0L);
        System.out.println(date);
    }
}
