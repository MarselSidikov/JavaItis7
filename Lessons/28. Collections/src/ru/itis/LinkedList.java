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
    private int count = 0;

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
        count++;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>();
        newNode.element = element;

        if (head == null) {
            head = newNode;
            tail = newNode;
            count++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        count++;
    }

    public T get(int index) {

        if (index >= 0 && index < count) {
            int i = 0;
            Node<T> current = head;
            while (i < index) {
                current = current.next;
                i++;
            }
            return current.element;
        } else {
            return null;
        }
    }

    public void remove(int index) {
        
    }
}
