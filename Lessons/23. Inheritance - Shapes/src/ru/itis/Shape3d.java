package ru.itis;

/**
 * 28.10.2017
 * Shape3d
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Shape3d {
    // координаты центра
    protected double x;
    protected double y;
    protected double z;

    public Shape3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void move(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void scale(double value) {
        System.out.println("Не реализовано");
    }
}
