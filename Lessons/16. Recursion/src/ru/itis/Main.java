package ru.itis;

public class Main {

    public static int fact(int n) {
        System.out.println("Enter in rec with n = " + n);
        if (n <= 0) {
            return 1;
        }
        int result = fact(n - 1) * n;
        System.out.println("Out from rec with result = " + result);
        return result;
    }

    public static int fib(int n) {
        System.out.println("Enter in rec with n = " + n);
        if (n > 1) {
            int result = fib(n - 1) + fib(n - 2);
            System.out.println("Out from rec with result = " + result);
            return result;
        } else {
            return 1;
        }
    }

    public static int fibOptimized(int x1, int x2, int n) {
        System.out.println("Enter in rec with n = " + n);
        if (n > 1) {
            int x3 = x2 + x1;
            x1 = x2;
            x2 = x3;
            int result =  fibOptimized(x1, x2, n - 1);
            System.out.println("Out from rec with result = " + result);
            return result;
        } else {
            return x2;
        }
    }

    public static void main(String[] args) {
        // int x = fact(6);
        int x = fibOptimized(1, 1, 10);
        System.out.println(x);
    }
}
