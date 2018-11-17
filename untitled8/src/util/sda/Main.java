package util.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti nr de linii");
        int linii = sc.nextInt();
        linii--;
        System.out.println("Introduceti nr de coloane");
        int coloane = sc.nextInt();
        int[][] matrice = new int[linii][coloane];
        for (int j = 0; j < coloane; j++) {
            System.out.println("n[" + j + ")(" + j + ")");
            matrice[j][j] = sc.nextInt();

        }

        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        if (linii == coloane) {
            System.out.println("Matricea e patratica");
            System.out.println("Diagonala principala:");
            for (int i = 0; i < linii; i++) {
                System.out.print(matrice[linii - 1 - i][i] + "  ");
            }
        } else {
            System.out.println("Matricea nu e patratica");

        }
        System.out.println();
        System.out.println("Diag.principala");
        for(int i=0; i < linii; i++){
            System.out.println();
        }
        System.out.println();


    }
}
