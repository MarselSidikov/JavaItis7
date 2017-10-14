package ru.itis;

public class Main1 {

    public static void showReverse(int array[]) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
	    int a[] = {11, 12, 13, 14, 15};
	    showReverse(a);
    }
}
