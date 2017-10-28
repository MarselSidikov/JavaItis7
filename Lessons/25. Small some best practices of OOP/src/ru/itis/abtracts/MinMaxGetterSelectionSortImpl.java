package ru.itis.abtracts;

/**
 * 28.10.2017
 * MinMaxGetterSelectionSortImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MinMaxGetterSelectionSortImpl extends AbstractMinMaxGetterSortingBased {

    public MinMaxGetterSelectionSortImpl(int[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        for (int i = 0; i < elements.length; i++) {
            int min = elements[i];
            int minIndex = i;
            for (int j = i; j < elements.length; j++) {
                if (min > elements[j]) {
                    min = elements[j];
                    minIndex = j;
                }
            }
            int temp = elements[i];
            elements[i] = min;
            elements[minIndex] = temp;
        }
    }
}
