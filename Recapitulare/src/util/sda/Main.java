package util.sda;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i=0; i<5;i++) {
            System.out.println("1" + i);
            if (i == 0)
                break;
            System.out.println("2" + i);
        }
        System.out.println();
            for (int i=0; i<5; i++) {
                System.out.println("i"+i);
                if (i==0)
                continue;
                System.out.println("2"+i);
            }
        }
    }

