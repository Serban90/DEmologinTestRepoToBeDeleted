package util.sda;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    static Scanner in;
    static String[] board;
    static String turn;

    public static void main(String[] args) {

        in = new Scanner(System.in); // aici ce intampla ?
        board = new String[9]; // aici fac o matrita goala de 9 numere ?
        turn = "X"; //definesc turn
        String winner = null; // definesc string
        populateEmptyBoard(); // inchem functia pentru populare

        System.out.println("Bine ai venit la x si 0"); // print
        System.out.println("--------------------------------");
        printBoard(); // print inchem functia
        System.out.println("X's va fi primul. Enter a slot number to place X in:"); // print

        while (winner == null) { // atat timp cat winner nu este null
            int numInput; // definesc numInput ?
            try {
                numInput = in.nextInt(); // aici nu inteleg
                if (!(numInput > 0 && numInput <= 9)) { // aici cred ca sa poti sa pui la 9
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) { // daca e o alta erroare ?
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }

            if (board[numInput-1].equals(String.valueOf(numInput))) { // aici nu inteleg ? cred ca sa fie randul la fiecare
                board[numInput-1] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                printBoard();
                winner = checkWinner();
            } else { // cred ca daca slotul e luat sa nu mai poti sa pui
                System.out.println("Slot already taken; re-enter slot number:");
                continue;
            }
        }
        if (winner.equalsIgnoreCase("draw")) { // nu inteleg ce face equalsIgnoreCase ?
            System.out.println("It's a draw! Thanks for playing.");
        } else { // aici daca ai castigat
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
    }
// functie verifica daca am castigat
    static String checkWinner() {
        for (int a = 0; a < 8; a++) { // aici nu inteleg // maxim 8 mutari ?
            String line = null;
            switch (a) { // nu inteleg de ce ?
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) { // nu inteleg ?
            if (Arrays.asList(board).contains(String.valueOf(a+1))) {
                break;
            }
            else if (a == 8) return "draw";
        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

    static void printBoard() { // deseaneaza tabelul
        System.out.println("/---|---|---\\");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("/---|---|---\\");
    }

    static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) { // nu inteleg
            board[a] = String.valueOf(a+1); // nu inteleg
        }
    }




}






