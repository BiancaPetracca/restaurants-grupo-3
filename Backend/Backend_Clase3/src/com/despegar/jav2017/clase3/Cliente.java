package com.despegar.jav2017.clase3;

public class Cliente {

    private String nombre;
    private TipoDeCliente tipoDeCliente;

    public Cliente(String nombre, TipoDeCliente tipoDeCliente) {
        this.nombre = nombre;
        this.tipoDeCliente = tipoDeCliente;
    }

    public Double calcularPrecio(Double precio) {
        return tipoDeCliente.calcularPrecio(precio);
    }
}
