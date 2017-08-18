package com.despegar.jav2017;

import java.util.List;
import java.util.stream.Collectors;

public class Buscador {


    public List<Restaurant> buscar(List<Restaurant> restaurants, Criterio criterio) {
        return restaurants.stream().filter(restaurant ->
                criterio.cumple(restaurant) && restaurant.estaActivo())
                .collect(Collectors.toList());
    }

}

