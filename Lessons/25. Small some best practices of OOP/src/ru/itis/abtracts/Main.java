package ru.itis.abtracts;

/**
 * 28.10.2017
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        int array[] = {100, -1, -50, -60, 70, 80, 90, 5};
        MinMaxGetter getter1 = new MinMaxGetterBubbleSortImpl(array);
        MinMaxGetter getter2 = new MinMaxGetterSelectionSortImpl(array);
        MinMaxGetter getter3 = new MinMaxGetterFindImpl(array);
        System.out.println(getter1.getMin());
        System.out.println(getter2.getMax());
        System.out.println(getter3.getMin());
    }
}
