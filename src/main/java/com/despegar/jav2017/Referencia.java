package com.despegar.jav2017;

public class Referencia implements Criterio {


    private Integer referenciaMinima;

    public Referencia(Integer referenciaMinima) {
        this.referenciaMinima = referenciaMinima;
    }

    @Override
    public Boolean cumple(Restaurant restaurant) {
        return restaurant.tieneMejorReferenciaQue(referenciaMinima);
    }
}
