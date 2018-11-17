package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Hello!");

        if (n < 0) {
            System.out.println("Numarul e negativ");
        }

        if (n == 0) {
            System.out.println("Numarul e zero");
        }
        if (n > 0) {

            System.out.println("Numarul e pozitiv");
        }

    }
}
