package com.company1.restaurant;

public class RestaurantAmerican extends  Restaurant {

    boolean driveThrough;

    public RestaurantAmerican(String nume,boolean driveThrough) {
        super(nume);
    }

    public void opening(){
        System.out.println ("Food for free today!");
    }



}
