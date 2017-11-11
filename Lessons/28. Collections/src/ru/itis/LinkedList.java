package ru.itis;

/**
 * 11.11.2017
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void addToBegin(T element) {
        // создаем новый узел
        Node<T> newNode = new Node<>();
        // кладем в узел значение
        newNode.element = element;

        // если в списке не было ничего
        if (head == null) {
            // новый элемент, который пришел первым, стал последним
            tail = newNode;
        }

        newNode.next = head;
        this.head = newNode;
    }

    // добавляет в конец
    public void add(T element) {

    }

    public T get(int index) {
        return null;
    }
}
