package com.company1.restaurant;

import com.company1.food.FelMancare;

import java.util.ArrayList;
import java.util.List;

public abstract class Restaurant {

    private String nume;
    private String adresa;
    private double rating;
    private String telefon;

    public static final String Domeniu_De_Activitate = "Alimentatie";

    private List<FelMancare> meniu = new ArrayList<>();

    public Restaurant(String nume) {
        this.nume = nume;

    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getRating() {
        return rating;
    }

    public String getTelefon() {
        return telefon;
    }

    public void reclama() {
        System.out.println("Sa ne facem publicitate");
    }

    public void adaugaInMeniu(FelMancare felMancare) {
        meniu.add(felMancare);
    }

    public abstract void opening();
}




