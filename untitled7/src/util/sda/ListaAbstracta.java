package util.sda;
public class ListaAbstracta {
    private ElementListaAbstracta primul;
    private ElementListaAbstracta ultimul;
    private int marime = 0;


    public boolean isEmpty(){
        return marime == 0;
    }

    public void adauga (Object val){
        ElementListaAbstracta unNouElement = new ElementListaAbstracta(val);
        if(isEmpty()){
            primul = unNouElement;
        } else {
            ultimul.setUrmatorulElement(unNouElement);
        }

        ultimul = unNouElement;

        marime++;
    }

    public Object scoate () {
        if (isEmpty()) {
            return null;
            ElementListaAbstracta rezultat = ultimul;
            ElementListaAbstracta penultimul = getPenultimul();
            if (penultimul != null)
                penultimul.setUrmatorulElement(null);
            marime--;
            ultimul = penultimul;

            if (rezultat == null)
                return null;
            else
                return rezultat.getValoare();
        }

        private ElementListaAbstracta getPenultimul () {
            if (isEmpty())
                return null;
            ElementListaAbstracta element = primul;
            ElementListaAbstracta penultimul = null;
            while (element.getUrmatorulElement() != null) {
                penultimul = element;
                element = element.getUrmatorulElement();
            }

            return penultimul;
        }

        public int getMarime () {
            return marime;
        }

        private ElementListaAbstracta getPrimul () {
            return primul;
        }

        private ElementListaAbstracta getUltimul () {
            return ultimul;
        }

        public Object get ( int pos){
            if (pos < 0 && pos > marime)
                return null;

            ElementListaAbstracta elementulCurent = this.getPrimul();
            int i = 0;
            for (i = 0; i < pos; i++) {
                elementulCurent = elementulCurent.getUrmatorulElement();
            }
            return elementulCurent.getValoare();
        }


    }