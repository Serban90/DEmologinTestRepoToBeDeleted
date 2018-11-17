package com.company1.restaurant;

public class RestaurantItalian extends Restaurant {
    private String nume;
    private String numeFormatie;
    private boolean calcioALaTV;

    public RestaurantItalian(String nume, String numeFormatie) {
        super(nume);
        this.numeFormatie = numeFormatie;
    }

    public boolean isCalcioALaTV() {
        return calcioALaTV;
    }

    public void setCalcioALaTV(boolean calcioALaTV) {
        this.calcioALaTV = calcioALaTV;
    }


    //  @Override
    public  void reclama(String s) {
        System.out.println("Benvenutti!" + getNume());

    }

    public void opening(){
        System.out.println ("Am deschis, poftiti inauntru!");
    }

}
