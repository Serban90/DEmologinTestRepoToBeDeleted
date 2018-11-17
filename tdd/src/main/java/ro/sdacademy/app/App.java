package ro.sdacademy.app;
import ro.sdacademy.util.Calculator;

public class App {
    public static void main(String[] args) {
      /*
        String res = Calculator.fib(3).trim();
        String res2 = Calculator.fib(3).trim();
        System.out.println(res.getClass());
        System.out.println(res.length());
        for(int i = 0 ; i < res.length(); i++){
            System.out.println(i + ":" + res.charAt(i));
            System.out.println(i + ":" + res2.charAt(i));



    }
    System.out.println(res.equals(Calculator.fib(3).trim()));*/
        //assert Calculator.fib(3).equals("1 1 2 ");
        System.out.println(Calculator.fib(3));
        System.out.println(Calculator.fib(3));
        System.out.println(Calculator.fib(3));
        System.out.println(Calculator.fib(3));

        System.out.println("----fib2----");
        System.out.println(Calculator.fib2(3));
        System.out.println(Calculator.fib2(3));
        System.out.println(Calculator.fib2(3));
        System.out.println(Calculator.fib2(3));


        assert Calculator.fib2(3).equals(Calculator.fib2(3));
        assert Calculator.fib2(3).equals("1 1 2 ");

        assert Calculator.add(2, 3) == 5 : "Sum incorrect";

    }

}
