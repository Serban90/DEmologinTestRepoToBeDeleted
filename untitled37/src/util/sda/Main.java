package util.sda;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
public static void main(String[] args){}
    public static void mystery1(Stack s) {
        // write your code here


        while (!s.isEmpty()) {
            int n = (int) s.pop();
            q.add(n);
            q.add(n);



        }
        while (!((LinkedList) q).isEmpty()) {
            s.push(q.remove());

        }
        System.out.println(s);
    }
}

