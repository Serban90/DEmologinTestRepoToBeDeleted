package util.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        String x = sc.next();
        Masina [] masini = new Masina [10];

        while (!(x.equalsIgnoreCase("e"))) {
            System.out.print("Apasa L sau I sau E");
            x = sc.next();
            continue;
        }


            if ((count >9) && (x.equalsIgnoreCase("i"))) {
                System.out.println("Stringul este plin. Nu mai apasa I, apasa Apasa L sau I sau E");
                x = sc.next();
                continue;

                if (x.equalsIgnoreCase("e")) {
                    System.out.print("Programul a fost inchis");
                    return;

            }
        }


        while (x.equalsIgnoreCase("i")) {
            System.out.println("Introduceti ce tipul masinii");
        String y = sc.next();

        if (y.equalsIgnoreCase("Dacia")) {
            masini[count] = new Dacia();
            count++;
            if (y.equalsIgnoreCase("BMW")) {
                masini[count] = new BMW();
                count++;

                if (y.equalsIgnoreCase("VW")) {
                    masini[count] = new VW();
                    count++;
            }
        }





            }
            }
	Masina M = new Masina();
	System.out.println(M.Salut());

	Dacia D = new Dacia();
	System.out.println(D.Salut());

	BMW B = new BMW();
	System.out.println(B.Salut());

	VW V = new VW();
	System.out.println(V.Salut());

	X1 x1 = new X1();
	System.out.println(x1.Salut());

	X2 x2 = new X2();
	System.out.println(x2.Salut());

	X3 x3 = new X3();
	System.out.println(x3.Salut());


    }
}
