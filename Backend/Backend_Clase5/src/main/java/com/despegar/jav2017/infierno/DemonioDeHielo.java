package com.despegar.jav2017.infierno;

public class DemonioDeHielo extends Demonio {

    public DemonioDeHielo(Double nivelDeMaldad, Integer limiteDeNivelDeValor, String nombre) {
        super(limiteDeNivelDeValor, nombre);
        this.nivelDeMaldad = nivelDeMaldad;
    }

    @Override
    public Boolean puedeCazar(Alma alma) {
        return alma.esFriolenta();
    }

    @Override
    protected void ponerObstaculos(Alma alma) {
        estadoDeAnimo.hacerFriolenta(alma);
    }

}
