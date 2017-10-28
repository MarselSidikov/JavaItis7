package ru.itis;

/**
 * 28.10.2017
 * Ellipse
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Ellipse extends Shape {
    private double r1;
    private double r2;

    public Ellipse(double x, double y, double r1, double r2) {
        super(x, y);
        this.r1 = r1;
        this.r2 = r2;
    }

    public double calcArea() {
        return Math.PI * r1 * r2;
    }

    public double calcPerimeter() {
        return 2 * Math.PI * Math.sqrt((r1 * r1 + r2 * r2) / 2);
    }
}
