public class Persoana {
    int varsta;
    String nume;

    public Persoana(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;


    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

}