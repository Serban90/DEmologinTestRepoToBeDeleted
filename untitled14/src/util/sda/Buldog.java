package util.sda;

public class Buldog extends Caine{

    public Buldog(String nume){
        super(nume);
    }

    public String salut() {
        return super.salut() + ", Buldog.";
    }
 }

