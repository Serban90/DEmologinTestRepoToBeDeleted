package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introdu doua numere");

        int a =3;

        int b =4;

        int c;

        c=a;
        a=b;
        b=c;

        System.out.println("a = " +a);
        System.out.println("b = " +b);


        System.out.print("introduceti n ");
        int n = sc.nextInt();
        int multiplicator = 2;
        int rezultat=1;


        while (multiplicator <=n);

        rezultat= rezultat * multiplicator;
        multiplicator++;


        System.out.println("N! = " + rezultat);












        }







    }
