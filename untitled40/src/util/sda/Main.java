package util.sda;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int findLongestSorted(int[] array) {

        // write your code here
        int maxCount = 0, count = 0;
        int prev = array[0];
        for (int num : array) {
            if (prev <= num) {
                count++;


            } else {
                count = 1;
            }
            if (count > maxCount)
                maxCount = count;
            prev = num;

        }
        return maxCount;

    }

    public static void main(String[] s) throws IOException {
        int[] arr = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
        System.out.println("Number of repeating positions " + findLongestSorted(arr));
    }


        int[] arr = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};


    }



