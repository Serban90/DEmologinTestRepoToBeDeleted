package ro.sdacademy.javaadvanced.lab.collection.maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,6,3,9,0,33,45,1,6,9));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }

        System.out.println("-----------------");
        for (Integer i : list){
            System.out.println(i);

            // list.remove(i);




        }







        }
    }

