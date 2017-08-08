package com.despegar.jav2017.clase3;

public abstract class TipoDeCliente {

    public Double calcularPrecio(Double precio) {
        return precio * getIndice();
    }

    public abstract Double getIndice();

}
