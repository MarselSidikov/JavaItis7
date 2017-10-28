package ru.itis.abtracts;

/**
 * 28.10.2017
 * AbstractMinMaxGetterSortingBased
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class AbstractMinMaxGetterSortingBased implements MinMaxGetter {
    protected int elements[];
    private boolean isSorted;

    public AbstractMinMaxGetterSortingBased(int[] elements) {
        this.elements = elements;
        this.isSorted = false;
    }

    public int getMin() {
        if (!isSorted) {
            sort();
            isSorted = true;
            return elements[0];
        } else {
            return elements[0];
        }
    }

    public int getMax() {
        if (!isSorted) {
            sort();
            isSorted = true;
            return elements[elements.length - 1];
        } else {
            return elements[elements.length - 1];
        }
    }

    public abstract void sort();

}
