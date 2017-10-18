package ru.itis;

public class Main {
    public static boolean isLetter(char c) {
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    // '1' -> 1
    // '8' -> 8
    public static int convertToIntFromDigit(char c) {
        // c = '1', код - 49
        // '1' - '0' = 49 - 48 = 1
        // c = '5', код - 53
        // '5' - '0' = 53 - 48 = 5
        return c - '0';
    }

    // ['2','3','1','6'] -> 2316
    public static int parseNumber(char digits[]) {
        return -1;
    }


    public static void main(String[] args) {
	    char letterA = 'A';
	    // результат операции char + int -> int
	    int letterBCode = letterA + 1;
	    char letterB = (char)letterBCode;
        System.out.println(letterB);

    }
}
