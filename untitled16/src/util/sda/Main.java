package util.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in) ;
        int i=0;
        int marime;
        int[] sirNr;
        System.out.println("Introduceti numarul de numere intregi de introdus");
        marime=in.nextInt();
        sirNr = new int[marime];


        for(i=0; i< marime; i++) {
            sirNr[i] = in.nextInt();

        }



        for(i=0;i< marime; i++)
        {
            System.out.println(sirNr[i]);
        }




    }
}
