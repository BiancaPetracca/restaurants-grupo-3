package com.despegar.jav2017.infierno;

public class DemonioDeSombras extends Demonio {

    public DemonioDeSombras(Integer limiteDeNivelDeValor, String nombre) {
        super(limiteDeNivelDeValor, nombre);
    }

    private static Double nivelDeMaldad = 50.0;


    @Override
    public Boolean puedeCazar(Alma alma) {

        return !alma.esFriolenta();
    }

    @Override
    protected void ponerObstaculos(Alma alma) {

        alma.disminuirNivelDeValor(0.5);
    }
}
