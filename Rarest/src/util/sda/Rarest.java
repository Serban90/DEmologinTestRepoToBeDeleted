package util.sda;

import java.util.HashMap;
import java.util.Map;

public class Rarest {

    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        // write your code here

        data.put("Alyssa", 22);
        data.put("Char", 25);
        data.put("Dan", 25);
        data.put("Jeff", 20);
        data.put("Kasey", 20);
        data.put("Kim", 20);
        data.put("Mogran", 25);
        data.put("Ryan", 25);
        data.put("Stef", 22);
        data.put("Florian", 19);
        data.put("Alex", 19);

        Map<Integer, Integer> processed = new HashMap<>();

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            int age = entry.getValue();
            if (processed.containsKey(age)) {
                processed.put(age, processed.get(age) + 1);
            } else {
                processed.put(age, 1);
            }
        }
        Map.Entry<Integer, Integer> first = processed.entrySet().iterator().next();
        int minAge = first.getKey();
        int minOccurence = first.getValue();
        for (Map.Entry<Integer, Integer> entry : processed.entrySet()) {
            int age = entry.getKey();
            int occurence = entry.getValue();

            if (minOccurence > occurence) {
                minOccurence = occurence;
                minAge = age;
            } else if (minOccurence == occurence) {
                if (minAge > age)
                    minAge = age;
            }
            System.out.println(age + "-" + occurence);
        }

        System.out.println("Rezultat:");
        System.out.print(minAge + "-" + minOccurence);

    }

}

