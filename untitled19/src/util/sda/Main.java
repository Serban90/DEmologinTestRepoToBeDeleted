package util.sda;

public class Main {
    private static int[] arr = {1, 5, 7, 10, 22, 28};

    public static void main(String[] args) {
	// write your code here
        // TODO Auto-generated method stub

        System.out.println(gaseste(0, arr.length - 1, 1));
    }

    public static int gaseste(int stg, int dr, int x)
    {
        if (dr >= stg)
        {
            int mid = stg + (dr - stg)/2;

            if (arr[mid] == x)
                return mid;
            //daca x e mai mic decat 1/2, mergem in stanga
            if (x < arr[mid])
                return gaseste(stg, mid-1, x);
            else
                //daca x e mai mare decat 1/2, mergem in dreapta
                return gaseste(mid+1, dr, x);
        }

        //daca am aj aici nu am gas nimic, deci returnam -1
        return -1;
    }
}
