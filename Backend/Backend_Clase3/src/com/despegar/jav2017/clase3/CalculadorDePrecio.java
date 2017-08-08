package com.despegar.jav2017.clase3;

public class CalculadorDePrecio {

    private static Double IVA = 1.21;

    public Double calcular(Double precio, Cliente cliente) {

        return cliente.calcularPrecio(precio) * IVA;
    }


}
