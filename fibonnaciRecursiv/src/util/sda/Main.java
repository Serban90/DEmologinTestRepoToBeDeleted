package util.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    // write your code here



    static int count = 2;
    static int n;

    static void fib(int primul, int aldoilea) {
        if (n == 1) {
            System.out.println("Primul numar");
            return;
        }
        if (n == 2) {
            System.out.println("Al doilea numar");
            return;

        }
        if (count > n) {
            return;
           count ++;
            System.out.println(primul + aldoilea);


        }


    }


}