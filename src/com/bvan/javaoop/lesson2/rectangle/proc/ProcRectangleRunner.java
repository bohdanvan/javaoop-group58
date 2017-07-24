package com.bvan.javaoop.lesson2.rectangle.proc;

/**
 * @author bvanchuhov
 */
public class ProcRectangleRunner {

    public static void main(String[] args) {
        ProcRectangle rectangle = new ProcRectangle();
        rectangle.width = 10;
        rectangle.height = 20;

        double area = findArea(rectangle);
        System.out.println("area = " + area);
    }

    public static double findArea(ProcRectangle rectangle) {
        return rectangle.width * rectangle.height;
    }
}
