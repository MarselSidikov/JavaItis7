package ru.itis;

public class Main {

    public static void main(String[] args) {
	    RationalNumber rationalNumber = new RationalNumber();
	    rationalNumber.numerator = 25;
	    rationalNumber.denominator = 35;
	    rationalNumber.optimize();
        System.out.println(rationalNumber.numerator
        + "/" + rationalNumber.denominator);
    }
}
