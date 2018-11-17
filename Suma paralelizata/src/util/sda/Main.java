package util.sda;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int v[] = new int[n];


        Thread gandalf = new Thread(new Sum(v,1));
        System.out.println(gandalf);


    }
}
