package util.sda;

public class TestLista {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println("Este lista goala? " + lista.isEmpty());

        lista.adauga(new Element("Ana"));

        System.out.println("Este lista goala? " + lista.isEmpty());
        System.out.println("Marimea listei: " + lista.getMarime());

        lista.adauga(new Element("Bogdan"));
        lista.adauga(new Element("Catalin"));
        lista.adauga(new Element("Daniela"));
        lista.adauga(new Element("Eugen"));
        System.out.println("Este lista goala? " + lista.isEmpty());
        System.out.println("Marimea listei: " + lista.getMarime());


        Element elementulCurent = lista.getPrimul();

        while(elementulCurent != null){
            System.out.println(elementulCurent.getValoare());

            elementulCurent = elementulCurent.getUrmatorulElement();
        }


        lista.scoate();
        System.out.println("Este lista goala? " + lista.isEmpty());
        System.out.println("Marimea listei: " + lista.getMarime());

        lista.scoate();
        lista.scoate();
        lista.scoate();
        System.out.println("Este lista goala? " + lista.isEmpty());
        System.out.println("Marimea listei: " + lista.getMarime());

    }
}
