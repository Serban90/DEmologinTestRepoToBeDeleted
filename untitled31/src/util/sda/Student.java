package util.sda;

public class Student extends Persoana {
    private static final long serialVersionUID = -2301833602285826103L;
    private int anDeStudiu;

    Student(String nume, String prenume, int varsta, int andDeStudiu) {
        super(nume, prenume, varsta);

        this.anDeStudiu = andDeStudiu;

    }

    @Override
    public String toString() {
        return super.toString() + " Sunt un student in anul de studiu " + this.anDeStudiu + ". " +
                this.amBani();
    }

    @Override
    public String amBani() {
        return "N-am bani!";
    }


}
