package ru.itis.bad.inheritance;

public class Main {

    public static void main(String[] args) {
	    Иван иван = new Иван(25, "Иванов");
	    Петя петя = new Петя(21, "Петров");

	    иван.программировать();
        иван.курить();
	    петя.программировать();
        петя.гулять();
        петя.курить();

    }
}
