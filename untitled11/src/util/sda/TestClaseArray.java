package util.sda;

import java.util.Scanner;

public class TestClaseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Elev[] prieteni = new Elev[5];
        int i;

        for(i = 0 ; i < prieteni.length; i++){
            System.out.println("Nume elev " + i);
            prieteni[i].setNume(in.next());
            System.out.println(("Prenume elev"));
        }
    }
}
