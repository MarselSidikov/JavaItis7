package ru.itis.abtracts;

/**
 * 28.10.2017
 * MinMaxGetterFindImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MinMaxGetterFindImpl implements MinMaxGetter {
    private int elements[];

    public MinMaxGetterFindImpl(int[] elements) {
        this.elements = elements;
    }

    @Override
    public int getMin() {
        int min = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (min > elements[i]) {
                min = elements[i];
            }
        }
        return min;
    }

    @Override
    public int getMax() {
        int max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (max < elements[i]) {
                max = elements[i];
            }
        }
        return max;
    }
}
