package ro.sdacademy.util;

public class Calculator {
    static int n1=1,n2=1,n3=0;

    public static int add(int a, int b){
        return a * b;
}
    public static String fib(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Fibonacci started from 2 rabbits!");
        }
        return "1 1 " + fibR(n);
    }
    public static String fib2(int n) {
        n1=1;
        n2=1;
        n3=0;
        if(n < 2) {
            throw new IllegalArgumentException("Fibonacci started from 2 rabbits!");
        }
        return "1 1 " + fibR(n);
    }
    public static String fibR(int n) {
        if (n > 2) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            return n3 + " " + fibR(n - 1);
        }
        return "";
    }
}