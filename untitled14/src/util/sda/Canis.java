package util.sda;

public class Canis extends Caine{

    public Canis(String nume){
        super(nume);
    }

    public String salut() {
        return super.salut() + ", Canis.";
    }
}
