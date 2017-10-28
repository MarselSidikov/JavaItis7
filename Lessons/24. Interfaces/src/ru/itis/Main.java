package ru.itis;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(0, 0, 1, 10, 5, 10);
        Sphere sphere = new Sphere(-1, -1, -1, 15);
        Point point = new Point(1, 1, 1);
        Cylinder cylinder = new Cylinder(10, 10, 1, 5, 5);
        Segment segment = new Segment(1,1,1,1, 3,3);
        Scalable scalables[] = {box, sphere, cylinder, segment};

        for (int i = 0; i < scalables.length; i++) {
            scalables[i].scale(0.95);
        }

        VolumeShape shapes[] = {box, sphere, cylinder};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calcArea());
        }
    }
}
