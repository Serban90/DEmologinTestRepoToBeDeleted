package ro.sdacademy.javaadvanced.lab.collection.maps;

public class GenericsTest {

    public static void main (String[] args){
        Node n = new Node();

        n.setPayload("test");

        n.setPayload(1);

        NodeGeneric<? extends Number> n2 = new NodeGeneric<>();
        Integer i =5;

        n2.setPayload(i);
    }
}
