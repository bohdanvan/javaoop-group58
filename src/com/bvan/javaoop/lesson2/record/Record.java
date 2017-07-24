package com.bvan.javaoop.lesson2.record;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class Record {

    private final String name;
    private final Date date = new Date();

    public Record(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
