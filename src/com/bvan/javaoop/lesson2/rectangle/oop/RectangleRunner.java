package com.bvan.javaoop.lesson2.rectangle.oop;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);

        double area = rectangle.getArea();
        System.out.println("area = " + area);

        System.out.println(rectangle);
    }
}
