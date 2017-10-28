package ru.itis;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(0, 0, 1, 10, 5, 10);
        Sphere sphere = new Sphere(-1, -1, -1, 15);
        Point point = new Point(1, 1, 1);

        box.move(10, 10, 10);
        System.out.println("Box ("
                + box.getX() + ", "
                + box.getY() + ", "
                + box.getZ() + ")");

//        int numbers[] = new int[3];
//        numbers[0] = 5;
//        numbers[1] = 6;
//        numbers[2] = 7;

        // восходящее приведение
        Shape3d boxShape = box;
        boxShape.scale(0.5);

        Shape3d shapes[] = new Shape3d[3];
        shapes[0] = box;
        shapes[1] = sphere;
        shapes[2] = point;

        for (int i = 0; i < 3; i++) {
            shapes[i].scale(0.95);
        }

        System.out.println(box.getHeight());
        System.out.println(sphere.getRadius());
    }
}
