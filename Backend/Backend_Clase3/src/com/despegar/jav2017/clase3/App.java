package com.despegar.jav2017.clase3;

public class App {

    public static void main(String args[]) {
        TipoDeCliente bianca = new EmpleadoDespegar();
        CalculadorDePrecio calculadorDePrecio = new CalculadorDePrecio();

        calculadorDePrecio.calcular(150.5, bianca);
    }
}
