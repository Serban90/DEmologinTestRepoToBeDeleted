package util.sda;

public class TestListaAbstracta {
    public static void main(String[] args) {
        ListaAbstracta lista = new ListaAbstracta();

        System.out.println("Este lista goala? " + lista.isEmpty());

        lista.adauga("Ana");

        System.out.println("Este lista goala? " + lista.isEmpty());
        System.out.println("Marimea listei: " + lista.getMarime());

        lista.adauga("Bogdan");
        lista.adauga("Catalin");
        lista.adauga("Daniela");
        lista.adauga("Eugen");
        System.out.println("Este lista goala? " + lista.isEmpty());
        System.out.println("Marimea listei: " + lista.getMarime());

        int i = 0;
        for(i = 0 ; i < lista.getMarime(); i++)
            System.out.println(lista.get(i));



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