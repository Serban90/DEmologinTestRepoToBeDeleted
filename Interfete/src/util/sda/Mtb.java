package util.sda;

abstract   public class Mtb implements  Bicicleta {

    public int marimeRoti;
    public boolean suspensieFurca=true;

    public int getMarimeRoti() {
        return marimeRoti;
    }

    public boolean getsuspensieFurca() {
        return suspensieFurca;
    }

    abstract public void setMarimeRoti();
    abstract public void setSuspensieFurca();

}
