package ru.itis.bad.inheritance;

/**
 * 28.10.2017
 * Петя
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Петя extends Иван {

    public Петя(int возраст, String фамилия) {
        super(возраст, фамилия);
    }

    public void гулять() {
        System.out.println("Гуляю!");
    }
}
