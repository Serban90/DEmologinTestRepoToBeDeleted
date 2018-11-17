package util.sda;

public class Animal {
    private String nume;

    public Animal(String nume){
        this.nume = nume;
    }
    public String salut() {
        return"Salut, sunt un animal, pe nume" + nume;
    }

}