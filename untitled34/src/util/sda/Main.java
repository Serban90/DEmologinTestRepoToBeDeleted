package util.sda;




public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] newArray = {2, 15, 25, 12, 8, 9, 4, 5, 32};
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;

                }
            }
        }

        for (int aNewArray : newArray)
            System.out.print(aNewArray + " ");

    }

}