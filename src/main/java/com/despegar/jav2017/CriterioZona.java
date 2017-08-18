package com.despegar.jav2017;

public class CriterioZona {
    String zona;

    public CriterioZona(String zona) {
        this.zona = zona;
    }

    public Boolean cumple(Restaurant restaurant) {
        return restaurant.estaEnZona(zona);
    }
}
