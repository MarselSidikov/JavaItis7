package ru.itis;

/**
 * 21.10.2017
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
// класс человек
public class Human {
    // поля
    int age;
    double height;
    char sex;
    boolean isProgrammer;

    void olding(int years) {
        age = age + years;
    }
}
