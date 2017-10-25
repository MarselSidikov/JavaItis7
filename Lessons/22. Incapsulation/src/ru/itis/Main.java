package ru.itis;

public class Main {

    public static void main(String[] args) {
        RationalNumber rationalNumber = new RationalNumber(25, 35);
//        rationalNumber.numerator = 25;
//        rationalNumber.denominator = 35;
        rationalNumber.optimize();
        rationalNumber.showNumber();

        System.out.println(rationalNumber.getNumerator()
        + ":" + rationalNumber.getDenominator());
    }
}
