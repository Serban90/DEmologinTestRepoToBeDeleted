package util.sda;

public class Element {
    private String valoare;
    private Element urmatorulElement;


    public Element(String valoare) {
        this.valoare = valoare;
    }

    public String getValoare() {
        return valoare;
    }
    public void setValoare(String valoare) {
        this.valoare = valoare;
    }
    public Element getUrmatorulElement() {
        return urmatorulElement;
    }
    public void setUrmatorulElement(Element urmatorulElement) {
        this.urmatorulElement = urmatorulElement;
    }
}
