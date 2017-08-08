package com.despegar.jav2017.clase3;

public class Pasajero extends TipoDeCliente {

    private Double comision;
    private Double indice;

    public Pasajero(Double comision, Double indice) {
        this.comision = comision;
        this.indice = indice;
    }

    public Double getIndice() {
        return indice;
    }


    public Double calcularPrecio(Double precio) {
        return super.calcularPrecio(precio) + comision;
    }
}
