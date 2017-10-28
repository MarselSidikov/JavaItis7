package ru.itis;

/**
 * 28.10.2017
 * Rectangle
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double x, double y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public double calcArea() {
        return a * b;
    }

    public double calcPerimeter() {
        return (a + b) * 2;
    }
}
