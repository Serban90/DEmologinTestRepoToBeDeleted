package util.sda;

import java.util.Random;


public class Main {

  public static void main(String[] args)  {
    Random rand = new Random();
    int value = rand.nextlnt (100);
    String str = rand.toString();
    System.out.Println("Random == " + value+"; str==" +str);

  }
}