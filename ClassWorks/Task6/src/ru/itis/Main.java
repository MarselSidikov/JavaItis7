package ru.itis;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static boolean isLetter(char c) {
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    // '1' -> 1
    // '8' -> 8
    public static int convertToIntFromDigit(char c) {
        // c = '1', код - 49
        // '1' - '0' = 49 - 48 = 1
        // c = '5', код - 53
        // '5' - '0' = 53 - 48 = 5
        return c - '0';
    }

    // ['2','3','1','6'] -> 2316
    public static int parseNumber(char digits[]) {
        int result = 0;
        int pow = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            result = result + convertToIntFromDigit(digits[i]) * pow;
            pow = pow * 10;
        }
        return result;
    }
    public static void main(String[] args) {
        // создаем scanner, который будет считывать с консоли
        Scanner scanner = new Scanner(System.in);

        // просим пользователя ввести длину числа, которое он введет (сколько в нем цифр?)
        int lengthNumber = scanner.nextInt();
        // создаем массив символов для этого числа
        char number[] = new char[lengthNumber];
        // посимвольно считываем цифры числа
        for (int i = 0; i < number.length; i++) {
            // scanner.next() - возвращает строку
            // charAt(0) - первый строки
            number[i] = scanner.next().charAt(0);
        }
        // в итоге в массиве number будут цифры числа, введенных пользователем

        int x = parseNumber(number);
        System.out.println(x);

        InputStream
    }
}
