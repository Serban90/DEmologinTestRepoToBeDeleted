package util.sda;

import java.util.Scanner;
public class Cititor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti marimea array-ului");
        int marimeaArray = scanner.nextInt();

        int[] myArray = new int[marimeaArray];

        for (int i = 0; i < marimeaArray; i++) {
            System.out.println("introduceti numarul de pe pozitia " + i + " din array");
            myArray[i] = scanner.nextInt();
        }

        for (int i : myArray)
            System.out.print(i);

        System.out.println("Introduceti nu numar:");
        int numarCompar = scanner.nextInt();

        System.out.println("Numere mai mici sunt: ");

        for (int i = 0; i < marimeaArray; i++) {
            if (myArray[i] < numarCompar) {
                System.out.println(myArray[i]);


            }


        }
    }
}