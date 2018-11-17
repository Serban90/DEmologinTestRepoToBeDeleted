package util.sda;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) throws FileNotFoundException {

        // LogManager.getLogManager().readconfiguration(new FileInputStream("/Volumes/data/code
        Scanner in = new Scanner(System.in);
        System.out.println("Cate linii?");
        int n = in.nextInt();
        in.nextLine();


        PrintWriter pw = new PrintWriter(new FileOutputStream("/Git/Code/Serban/Saptamana 8/Test/Test.txt ", true));

        for (int i = 0; i < n; i++) {
            System.out.println("Linia" + (i + 1));
            String S = in.nextLine();
            System.out.println("Linia introdusa este:" + S);
            pw.println(S);
        }
        pw.close();

    }







}




