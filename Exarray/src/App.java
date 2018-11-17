import util.sda.Main;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[]args) throws IOException {
        String fName = "/Git/Code/Serban/Saptamana 8/Test/Test.txt";

        BufferedReader br = new BufferedReader(new FileReader(fName));

        String line = null;
        while ((line = br.readLine()) !=null){
            System.out.println(line);
        }
        br.close();

        System.out.println("----------------------");

        Scanner reader = new Scanner(new File(fName));

        while (reader.hasNext()){
            System.out.println(reader.nextLine());
        }

        reader.close();
    }
}
