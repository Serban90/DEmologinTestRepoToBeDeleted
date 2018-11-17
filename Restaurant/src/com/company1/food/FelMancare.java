package com.company1.food;

public class FelMancare {

    private String name;
    private boolean vegetarian;
    private double pretUnitar;

    public FelMancare(String name, boolean vegetarian, double pretUnitar) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.pretUnitar = pretUnitar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPretUnitar() {
        return pretUnitar;
    }

    public void setPretUnitar(double pretUnitar) {
        this.pretUnitar = pretUnitar;
    }



}
