package ru.itis;

public class Main {

    static void addElement(ArrayList list, int element) {
        if (list.count < list.elements.length) {
            // положил элемент в первую пустую
            list.elements[list.count] = element;
            list.count++;
        } else {
            System.err.println("Нет места");
        }
    }
    static void deleteElement(ArrayList list, int index){
        if (index < list.count) {
            for (int i = index; i < list.count; i++) {
                list.elements[i] = list.elements[i + 1];
            }
            list.count--;
        } else {
            System.err.println("Неверный индекс");
        }
    }
    static void printElements(ArrayList list) {
        for (int i = 0; i < list.count; i++) {
            System.out.print(list.elements[i] + " ");
        }
    }

    public static void main(String[] args) {
        // создали массив массивов (списков)
	    ArrayList lists[] = new ArrayList[10];
	    for (int i = 0; i < lists.length; i++) {
	        lists[i] = new ArrayList();
        }
    }
}
