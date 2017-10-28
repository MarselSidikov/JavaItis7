package ru.itis;

/**
 * 28.10.2017
 * Sphere
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Sphere extends Shape3d implements Scalable, VolumeShape {

    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        if (radius >= 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void scale(double value) {
        this.radius = this.radius * value;
    }

    public double calcVolume() {
        return 0;
    }

    public double calcArea() {
        return 0;
    }
}
