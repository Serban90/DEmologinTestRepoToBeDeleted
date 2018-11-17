package util.sda;

import java.awt.*;
import java.util.ArrayList;


public class Generics1 {

    public static void main(String[] args) {
	// write your code here
        List persoane = new ArrayList<>();

        persoane.add(new Elev());
        persoane.add(new Student());
        persoane.add(new Masterand());
        persoane.add(6);



    }
}
