package util.sda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Animal[] animale;
        Scanner in = new Scanner(System.in);
        int nrAnimale;

        System.out.println("Cate animale?");
        nrAnimale = in.nextInt();
        animale = new Animal[nrAnimale];
        //int i=-1;
        //while(i<nrAnimale){
        //i++;
        for (int i = 0; i < nrAnimale; i++) {
            System.out.println("Ce animal? [Animal=Animal, Caine=Caine, Labrador=Labrador, Canis=Canis, Buldog=Buldog]");
            String tipAnimal = in.next();
            String numeAnimal;

            switch (tipAnimal) {
                case "Animal":
                    System.out.println("Introdu numele Animalului:");
                    numeAnimal = in.next();
                    animale[i] = new Animal(numeAnimal);
                    break;
                case "Caine":
                    System.out.println("Introdu numele Cainelui:");
                    numeAnimal = in.next();
                    animale[i] = new Caine(numeAnimal);
                    break;
                case "Labrador":
                    System.out.println("Introdu numele Labradorului:");
                    numeAnimal = in.next();
                    animale[i] = new Labrador(numeAnimal);
                    break;
                case "Canis":
                    System.out.println("Introdu numele Canisului:");
                    numeAnimal = in.next();
                    animale[i] = new Canis(numeAnimal);
                    break;
                case "Buldog":
                    System.out.println("Introdu numele Buldogului:");
                    numeAnimal = in.next();
                    animale[i] = new Buldog(numeAnimal);
                    break;
                default:
                    System.out.println("Animal indisponibil.");
                    i--;
                    break;
            }
        }

        for (int i = 0; i < nrAnimale; i++) {
            System.out.println(animale[i].salut());
        }
    }
    }