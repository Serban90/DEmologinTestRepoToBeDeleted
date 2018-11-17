package util.sda;

public class Main {
    public static void main(String[] args) {}


        // write your code here
        public static void parcurgere ( int i){

            //  System.out.println("pasul"+i);
            if (i == 0)
                return;
            parcurgere(i - 1);
            {
                System.out.println("pasul" + i);


            }
        }

    }