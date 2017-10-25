package ru.itis;

/**
 * 21.10.2017
 * RationalNumber
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class RationalNumber {
    // числитель
    private int numerator;
    // знаменатель
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    // метод - процедура для сокращения дроби
    void optimize() {
        int nod = runEuclidAlgorithm(numerator, denominator);
        this.numerator = numerator / nod;
        this.denominator = denominator / nod;
    }

    // выполняет поиск НОД двух чисел
    int runEuclidAlgorithm(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        // тернарный услонвый оператор e ? x : y,
        // результатом выражения будет x, если e - верно
        // и y - если e - ложно.
//        if (a != 0) {
//            return a;
//        } else {
//            return b;
//        }
        return a != 0 ? a : b;
    }

    void showNumber() {
        System.out.println(numerator
                + "/" + denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
