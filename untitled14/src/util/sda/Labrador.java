package util.sda;

public class Labrador extends Caine{

    public Labrador(String nume){
        super(nume);
    }

    public String salut() {
        return super.salut() + ", Labrador.";
    }

    }

