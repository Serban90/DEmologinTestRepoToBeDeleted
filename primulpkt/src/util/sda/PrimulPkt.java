package util.sda;

import java.util.Random;

public class PrimulPkt {

    public static void main(String[] args) {
	// write your code here
        Mate ob1 = new Mate(5,10);
        Mate ob2 = new Mate(100,300);
        Mate[] vect = new Mate[10];




        System.out.println("Merge! Suma ob1:" + ob1.suma()  );
        System.out.println("Merge! Prod ob2:" + ob2.produs()  );
        System.out.println("Suma Ex:" + Mate.sumaEx(55, 77));
        System.out.println("In Mate avem " + Mate.count + "obiecte");
    }
}
