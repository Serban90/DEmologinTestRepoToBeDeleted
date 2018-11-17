package util.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String cuvant;
        int i;
        boolean palindrom = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti un cuvant");
        cuvant = in.next();

        for (i=0; i< cuvant.length();i++) {
            if (cuvant.charAt(i)== cuvant.charAt(cuvant.length()-1-i)) {
                palindrom= true;
            } else palindrom = false;
        }
        if (palindrom);
          System.out.println("Cuvantul este palindrom");

              System.out.println("Cuvantul nu este Palindrom");
    }
}
