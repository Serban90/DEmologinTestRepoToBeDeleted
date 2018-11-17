package util.sda;

public class Somon extends Pesti {
      public Somon(String nume) {
          super(nume);
      }
    @Override
    public String salut() {
        return super.salut() + "Sunt un Somon";
    }
}
