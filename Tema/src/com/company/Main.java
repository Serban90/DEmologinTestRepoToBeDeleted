package com.company;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        // Create String array of three elements.
        Scanner sc = new Scanner(System.in);

        String[] values = {"bird", "cat", "cat", "wildebeest", "cat"};
        for (int i = 0; i < values.length; i++) {
            //System.out.println("i:" + i + "->>" + values[i] + ";");
            // System.out.println("i:" + i + "->>" + values[i].trim() + ";");
            System.out.println("i:" + i + "->>" +
                    values[i].replace("cat", "dog").trim()
                    + ";");

        }
    }

}

