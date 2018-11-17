package util.sda;

public class Lista {
    private Element primul;
    private Element ultimul;
    private int marime = 0;


    public boolean isEmpty(){
        return marime == 0;
    }

    public void adauga (Element unNouElement){
        if(isEmpty()){
            primul = unNouElement;
        } else {
            ultimul.setUrmatorulElement(unNouElement);
        }

        ultimul = unNouElement;

        marime++;
    }

    public Element scoate (){
        if(isEmpty()){
            primul = null;
            ultimul = null;
            return null;
        }

        Element rezultat = ultimul;
        ultimul = penultimul();
        ultimul.setUrmatorulElement(null);
        marime--;

        return rezultat;
    }

    private Element penultimul() {
        Element element = primul;
        Element penultimul = null;
        while(element.getUrmatorulElement() != null)
        {
            penultimul = element;
            element = element.getUrmatorulElement();
        }

        return penultimul;
    }

    public int getMarime() {
        return marime;
    }

    public Element getPrimul() {
        return primul;
    }

    public Element getUltimul() {
        return ultimul;
    }
}
