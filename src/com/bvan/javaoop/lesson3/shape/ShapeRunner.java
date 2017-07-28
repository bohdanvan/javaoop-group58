package com.bvan.javaoop.lesson3.shape;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Shape shape = new Circle(10.0);
        printArea(shape);
    }

    private static void printArea(Shape shape) {
        double area = shape.getArea();
        System.out.println(area);
    }

    private static void printRectangleWidth(Shape shape) { // bad! should receive Rectangle, not Shape
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.getWidth());
        } else {
            System.out.println("---");
        }
    }
}
