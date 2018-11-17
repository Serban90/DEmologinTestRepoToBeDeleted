package com.company1.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurantGrecesc = new RestaurantGrecesc("La Palicarul amarat");
        restaurantGrecesc.setAdresa("Mendeleev 8");

        System.out.println(restaurantGrecesc.getRating());
        restaurantGrecesc.reclama();

        RestaurantItalian restaurantItalian = new RestaurantItalian("Belezza", "Gianna Nanini");
        System.out.println(restaurantItalian.getRating());
        restaurantItalian.reclama();
        restaurantItalian.setCalcioALaTV(true);

        Restaurant restaurantAmerican = new RestaurantAmerican("McDrive",true);
        System.out.println(restaurantAmerican.getRating());
        restaurantAmerican.reclama();

        System.out.println(Restaurant.Domeniu_De_Activitate);

        List<Restaurant> lantDeRestaurante = new ArrayList<>();
        lantDeRestaurante.add(restaurantGrecesc);
        lantDeRestaurante.add(restaurantItalian);
        lantDeRestaurante.add(restaurantAmerican);

        for (Restaurant myRestaurant: lantDeRestaurante) {
            myRestaurant.reclama();
            myRestaurant.opening();
        }



    }
}
