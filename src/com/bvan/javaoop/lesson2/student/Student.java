package com.bvan.javaoop.lesson2.student;

/**
 * @author bvanchuhov
 */
public class Student { // DTO

    private String name;
    private String email;
    private int level;
    private long money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", money=" + money +
                '}';
    }
}
