package util.sda;


public class Doctor extends Persoana {
    private static final long serialVersionUID = 7390578117704525593L;

    private int grad;

    Doctor(String nume, String prenume, int varsta, int grad) {
        super(nume, prenume, varsta);

        this.grad = grad;

    }

    @Override
    public String amBani() {
        return "Am bani";
    }

    @Override
    public String toString() {
        return super.toString() + " Sunt un doctor cu gradul " + this.grad + ". " + this.amBani();
    }


}
