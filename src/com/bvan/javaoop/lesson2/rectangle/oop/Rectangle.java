package com.bvan.javaoop.lesson2.rectangle.oop;

/**
 * @author bvanchuhov
 */
public class Rectangle {

    private static int rectanglesCounter = 0;

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width < 0) {
            throw new IllegalArgumentException("negative width: " + width);
        }
        if (height < 0) {
            throw new IllegalArgumentException("negative height: " + height);
        }

        this.width = width;
        this.height = height;

        rectanglesCounter++;
    }

    public Rectangle(double size) {
        this(size, size);
    }

    public Rectangle() {
        this(10.0);
    }

    public static int getRectanglesCounter() {
        return rectanglesCounter;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle changeWidth(double width) {
        return new Rectangle(width, this.height);
    }

    public Rectangle changeHeight(double height) {
        return new Rectangle(this.width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
