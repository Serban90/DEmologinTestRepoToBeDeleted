package util.sda;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CreareAgenda {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        Character userChoice = ' ';
        String nume = null;
        String prenume = null;
        int varsta = -1;
        int anDeStudiu = -1;
        int grad = -1;
        Persoana p = null;
        List<Persoana> persoane = new ArrayList<>();
        while (userChoice != 'e') {

            System.out.println("Introduceti s ptr un nou student, d ptr un nou doctor, e ptr a termina");

            userChoice = Character.toLowerCase(input.next().charAt(0));

            switch (userChoice) {
                case 's':
                    System.out.println("---Introducere nou Student.---");
                    System.out.println("Introduceti Numele studentului:");
                    nume = input.next();
                    System.out.println("Nume Student: " + nume);
                    System.out.println("Introduceti Prenumele studentului:");
                    prenume = input.next();
                    System.out.println("Prenume Student: " + prenume);
                    System.out.println("Introduceti Varsta studentului:");
                    varsta = input.nextInt();
                    System.out.println("Varsta Student: " + varsta);
                    System.out.println("Introduceti Anul de Studiu al studentului:");
                    anDeStudiu = input.nextInt();
                    System.out.println("An de studiu Student: " + anDeStudiu);
                    p = new Student(nume, prenume, varsta, anDeStudiu);

                    persoane.add(p);
                    System.out.println("Am adaugat: " + p);
                    System.out.println("------------------------------------");
                    break;

                case 'd':
                    System.out.println("---Introducere nou Doctor.---");
                    System.out.println("Introduceti Numele doctorului:");
                    nume = input.next();
                    System.out.println("Nume Doctor: " + nume);
                    System.out.println("Introduceti Prenumele doctorului:");
                    prenume = input.next();
                    System.out.println("Prenume Doctor: " + prenume);
                    System.out.println("Introduceti Varsta doctorului:");
                    varsta = input.nextInt();
                    System.out.println("Varsta Student: " + varsta);
                    System.out.println("Introduceti Gradul doctorului:");
                    grad = input.nextInt();
                    System.out.println("Grad Doctor: " + grad);

                    p = new Doctor(nume, prenume, varsta, grad);
                    persoane.add(p);
                    System.out.println("Am adaugat: " + p);
                    System.out.println("------------------------------------");
                    break;


            }


        }

        System.out.println("---Scriere " + persoane.size() + " persoane.---");
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("agenda.txt"));

        oos.writeObject(persoane.size());

        for (Persoana oPersoana : persoane) {
            oos.writeObject(oPersoana);

        }

        oos.close();
        System.out.println("Am terminat de scris " + persoane.size() + " persoane.");
    }

}