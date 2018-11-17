package util.sda;
 //import Afis.Afisare;
 import util.sda.afis.sda.Afisare;

public class Mate {
    int a;
    int b;
    static int count = 0;
    public  Mate(int x, int y) {
        this.a = x;
        this.b = y;
        count++;
    }

    int suma() {
        return (this.a+this.b);

    }
    public static int sumaEx(int x, int y) {
        return(x+y);
    }
    int produs() {
        Afisare.Afis(this.a*this.b);

        return(this.a*this.b);
    }
}
