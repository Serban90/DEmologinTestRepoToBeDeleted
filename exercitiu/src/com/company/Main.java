package com.company;




import java.sql.Array;
import java.util.Scanner;
//import java.util.Arrays;
//import java.util.*;


public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int v[] = {12, 56, 12, 4, 12, 4, 7};
        int n, i, len;
        int contor = 0;
        /* citim un sir de numere de la tastatura */
        System.out.print("Introduceti lungimea vectorului:");
        len = scanner.nextInt();
        int v2[] = new int[len];
        for (i = 0; i < len; i++) {
            System.out.print("Intruceti v2[" + i + "]=");
            v2[i] = scanner.nextInt();
        }
        System.out.println("v2: " + Arrays.toString(v2));
        /* cautam de cate ori apare n in  sirul v */
        System.out.print("Introduceti n:");
        n = scanner.nextInt();
        for (i = 0; i < v.length; i++)
            'buffer = v[i];
        v[i] = v[v.length - i - 1];
        v[v.length - i - 1] = 'buffer';

    }

    System.out .'println'("v2: "+Array .'toString'('v'));
    int $;
    $ =

    suma(3,55);

    System.out.'printin("$** "+$);
    int n = 'medie (10,30,50);  n: 30
    System.out .'printIn("n" "+ n); n: 30

}
public static int suma(int a, int b) {
    System.out.println("Suma e: " + (a + b));
    return (a + b);

}
public static int medie (int c, int b, int a) {
    System.out.println("a**" + a + "; b=" + b + "; c**" + c);
    return ((a + b + c) / 3);

}
private static void afisez(int a) {
    System.out.println("$$$$$$$$$$");
    System.out.println("$ " + String.format("%4d", 555) + "  *";
    System.out.println();



}






















