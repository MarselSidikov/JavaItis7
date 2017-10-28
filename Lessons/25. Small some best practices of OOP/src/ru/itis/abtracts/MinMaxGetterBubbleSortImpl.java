package ru.itis.abtracts;

/**
 * 28.10.2017
 * MinMaxGetterBubbleSortImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MinMaxGetterBubbleSortImpl extends AbstractMinMaxGetterSortingBased {

    public MinMaxGetterBubbleSortImpl(int[] elements) {
        super(elements);
    }

    public void sort() {
        for (int i = elements.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }
}
