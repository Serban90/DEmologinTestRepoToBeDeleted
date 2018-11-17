package util.sda;

public class Caine extends Animal {
    public Caine(String nume){
        super(nume);

    }
    @Override
    public String salut() {
        return super.salut() + ",sunt un caine";
    }
}
