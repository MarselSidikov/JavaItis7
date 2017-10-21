package ru.itis;

import java.util.Scanner;

public class Main {
    // глобальная переменная
    public static int count = 0;
    // процедура добавления элемента
    public static void addElement(int array[], int element) {
        if (count < array.length) {
            // положил элемент в первую пустую
            array[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }
    public static void deleteElement(int array[], int index){
        if (index < count) {
            for (int i = index; i < count; i++) {
                array[i] = array[i + 1];
            }
            count--;
        } else {
            System.err.println("Неверный индекс");
        }
    }
    public static void printElements(int array[]) {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements[] = new int[10];

        while (true) {
            System.out.println("МЕНЮ:");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Показать массив");
            System.out.println("4. Выход");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    int element = scanner.nextInt();
                    addElement(elements, element);
                }
                break;
                case 2: {
                    int index = scanner.nextInt();
                    deleteElement(elements, index);
                } break;
                case 3: {
                    printElements(elements);
                } break;
                case 4: {
                    System.exit(0);
                }
            }
        }
    }
}
