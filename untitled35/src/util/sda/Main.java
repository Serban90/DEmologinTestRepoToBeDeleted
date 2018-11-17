package util.sda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Persoana> persoane = new ArrayList<>();

        persoane.add(new Persoana("Andrei", 11));
        persoane.add(new Persoana("Florian", 20));
        persoane.add(new Persoana("Bogdan", 36));
        persoane.add(new Persoana("Ana", 29));
        persoane.add(new Persoana("Daniela", 20));
        persoane.add(new Persoana("Roxana", 15));

        System.out.println("Nesortat:");
        for (Persoana p : persoane) {
            System.out.println(p);
        }

        Collections.sort(persoane, new VarstaComparator());

        System.out.println("Sortat dupa varsta:");
        for (Persoana p : persoane) {
            System.out.println(p);
        }
        Collections.sort(persoane, new NumeComparator());

        System.out.println("Sortat dupa nume:");
        for (Persoana p : persoane) {
            System.out.println(p);

        }
    }
}