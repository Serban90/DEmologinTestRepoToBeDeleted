import java.util.Scanner;

public class Exceptiicu2Numere {

    public static void main(String[] args) {
        String a;
        String b;
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.println("Introduceti 2 numere");
            a = in.next();
            b = in.next();

            try {
                System.out.println(Integer.parseInt(a) /Integer.parseInt(b));
                break;
            }
        }
    }

}