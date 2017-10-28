package ru.itis;

/**
 * 28.10.2017
 * Box
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Box extends Shape3d {
    // характеристики куба
    private double height;
    private double length;
    private double width;

    public Box(double x, double y, double z, double height, double length, double width) {
        super(x, y, z);
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
        if (length >= 0) {
            this.length = length;
        } else {
            this.length = 1;
        }
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void rectanglize() {
        this.z = this.z - this.width / 2;
        this.width = 0;
    }

    public void scale(double value) {
        this.length = this.length * value;
        this.height = this.height * value;
        this.width = this.width * value;
    }
}
