package util.sda;

public class Pesti {
     private String nume;

     public Pesti(String nume) {
         this.nume= nume;
     }
     public String salut() {
        return "Salut, sunt un peste, pe nume " + nume;
     }
}
