package ru.itis;

public class Main {

    public static void main(String[] args) {
	    // объявил объектную переменную - marsel
        // в marsel находится значение null
        Human marsel;
        // создание объекта (new Human()) и инициализация переменной marsel
        marsel = new Human();

        // задали значения полям объекта
        marsel.age = 23;
        marsel.height = 185;
        marsel.sex = 'M';
        marsel.isProgrammer = true;

        Human maxim = new Human();
        maxim.age = 21;
        maxim.height = 180;
        maxim.sex = 'M';
        maxim.isProgrammer = true;

        System.out.println(marsel.age + " " + maxim.age);

        marsel = maxim;
        marsel.isProgrammer = false;

        System.out.println(maxim.isProgrammer);

        Human human = new Human();
        human.age = 23;
        human.olding(3);
        System.out.println(human.age);

        Human alex = new Human(32, 174, 'M', true);
    }
}
