package util.sda;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class CitireAgenda {


        // write your code here
        public static void main (String[]args) throws IOException, ClassNotFoundException {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("agenda.txt"));

            Integer nr = (Integer) ois.readObject();

            for (int i = 0; i < nr; i++) {
                System.out.println(ois.readObject());

            }

            ois.close();
        }
    }
