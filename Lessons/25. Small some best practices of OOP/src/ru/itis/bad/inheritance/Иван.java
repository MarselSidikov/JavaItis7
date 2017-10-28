package ru.itis.bad.inheritance;

/**
 * 28.10.2017
 * Иван
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Иван {
    private int возраст;
    private String фамилия;

    public Иван(int возраст, String фамилия) {
        this.возраст = возраст;
        this.фамилия = фамилия;
    }

    public void программировать() {
        System.out.println("Программирую!");
    }

    public void курить() {
        System.out.println("Какие классные сигареты!");
    }

}
