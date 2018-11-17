package util.sda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionar {

    public static void main(String[] args) {
        // write your code here
        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        String exit = "/q";


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introduceti cuvintele");
            String in = sc.nextLine();

            if(in.equalsIgnoreCase(exit)){
                break;
            }
            String[] keyValue = in.split(" ");

            map.put(keyValue[0], keyValue[1]);
            map.put(keyValue[1], keyValue[0]);



            }
            while (true) {
                System.out.println("Introduceti cuvantul");
                String in = sc.nextLine();

                if (in.equalsIgnoreCase(exit)) {

                        break;
                    }
                    if (map.get(in)==null){
                    System.out.println(map2.get(in));
                    }
                    else {

                        System.out.println(map.get(in));
                    }
                }







            }



        }




