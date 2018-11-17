package util.sda;

public class Main {

    Scanner scanner = new Scanner(System.in);
	// write your code here

        System.out.println("introduceti marimea matrice, linie si coloana: ");
        int linie = scanner.nextInt();
        int coloana = scanner.nextInt();
        int[][] matrice = new int[linie][coloana];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.println("Introduceti numarul de pe pozitia matrice["
                        + i + "][" + j + "]");
                matrice[i][j] = scanner.nextInt();
    }
}
