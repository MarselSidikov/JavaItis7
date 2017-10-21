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
    int numerator;
    // знаменатель
    int denominator;

    // метод - процедура для сокращения дроби
    void optimize() {

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

}
