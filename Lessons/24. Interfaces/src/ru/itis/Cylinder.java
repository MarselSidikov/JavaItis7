package ru.itis;

/**
 * 28.10.2017
 * Cylinder
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Cylinder extends Shape3d implements Scalable, VolumeShape {
    private double radius;
    private double height;

    public Cylinder(double x, double y, double z, double radius, double height) {
        super(x, y, z);
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
        if (radius >= 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
    }

    public void scale(double value) {
        this.radius = this.radius * value;
        this.height = this.height * value;
    }

    public double calcVolume() {
        return 0;
    }

    public double calcArea() {
        return 0;
    }
}
