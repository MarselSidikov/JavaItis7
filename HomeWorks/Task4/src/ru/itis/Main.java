package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = null;
        int arraySize = 0;
        int count = 0;

        while (true) {
            System.out.println("МЕНЮ:");
            System.out.println("1. Создать массив");
            System.out.println("2. Добавить в начало");
            System.out.println("3. Отсортировать");
            System.out.println("4. Показать массив");
            System.out.println("5. Выход");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Введите размер массива");
                    arraySize = scanner.nextInt();
                    array = new int[arraySize];
                    System.out.println("Массив создан");
                } break;
                case 2: {
                    if (count < arraySize) {
                        for (int i = count; i >= 1; i--) {
                            array[i] = array[i-1];
                        }
                        array[0] = scanner.nextInt();
                        count++;
                    } else System.out.println("Нет места");
                } break;
                case 3: {
                    for (int i = 0; i < count; i++) {
                        // ищем минмальный элемент в диапазоне [i, N-1].
                        int min = array[i];
                        int indexOfMin = i;
                        for (int j = i; j < count; j++) {
                            if (min > array[j]) {
                                min = array[j];
                                indexOfMin = j;
                            }
                        }
                        // поменяли местами i-ый элемент и минимальный элемент
                        int temp = array[i];
                        array[i] = min;
                        array[indexOfMin] = temp;
                        // в min - минимальный элемент
                        // indexOfMin - индекс минимального элемента
                    }
                } break;
                case 4: {
                    for (int i = 0; i < count; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                } break;
            }
        }

    }
}
