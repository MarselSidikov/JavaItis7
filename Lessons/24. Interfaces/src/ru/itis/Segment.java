package ru.itis;

/**
 * 28.10.2017
 * Segment
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Segment extends Shape3d implements Scalable{
    private double length;
    private double angleA;
    private double angleB;


    public Segment(double x, double y, double z, double length, double angleA, double angleB) {
        super(x, y, z);
        if (length >= 0) {
            this.length = length;
        } else {
            this.length = 1;
        }

        this.angleA = angleA;
        this.angleB = angleB;
    }

    public double getLength() {
        return length;
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    @Override
    public void scale(double value) {
        this.length = this.length * value;
    }
}
