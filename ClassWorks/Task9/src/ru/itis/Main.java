package ru.itis;

public class Main {

    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(10, 15, 20, 5);
	    Circle circle = new Circle(10, 10, 15);
	    Square square = new Square(5, 5, 5);
	    Rectangle rectangle = new Rectangle(1, 2, 3, 4);

	    Shape shapes[] = {ellipse, circle, square, rectangle};

	    for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calcArea());
            System.out.println(shapes[i].calcPerimeter());
        }
    }
}
