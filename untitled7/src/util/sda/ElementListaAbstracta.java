package util.sda;

public class ElementListaAbstracta {
    private Object valoare;
    private ElementListaAbstracta urmatorulElement;


    public ElementListaAbstracta(Object valoare) {
        this.valoare = valoare;
    }

    public Object getValoare() {
        return valoare;
    }

    public void setValoare(Object valoare) {
        this.valoare = valoare;
    }

    public ElementListaAbstracta getUrmatorulElement() {
        return urmatorulElement;
    }

    public void setUrmatorulElement(ElementListaAbstracta urmatorulElement) {
        this.urmatorulElement = urmatorulElement;
    }

}