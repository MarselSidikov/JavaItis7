package ru.itis;

/**
 * 11.11.2017
 * MainList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addToBegin("Максим");
        list.addToBegin("Ильгиз");
        list.addToBegin("Артем");
        list.addToBegin("Александр");
        list.addToBegin("Денис");
    }
}
