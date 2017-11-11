package ru.itis;

public class MainNodes {

    /**
     *
     * @param a Первый узел
     * @param b Второй узел
     * @param element элемент, который нужно вставить между узлами
     */
    public static void addElement(Node<String> a,
                                  Node<String> b,
                                  String element) {
        Node<String> newNode = new Node<>();
        newNode.element = element;
        a.next = newNode;
        newNode.next = b;
    }
    public static void main(String[] args) {
	    Node<String> node1 = new Node<>();
	    node1.element = "Максим";

	    Node<String> node2 = new Node<>();
	    node2.element = "Ильгиз";

	    Node<String> node3 = new Node<>();
	    node3.element = "Артем";

        Node<String> node4 = new Node<>();
        node4.element = "Александр";

        Node<String> node5 = new Node<>();
        node5.element = "Денис";

	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;

        addElement(node3, node4, "Марсель");

	    Node<String> current = node1;

	    while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }


	    int i = 0;
    }
}
