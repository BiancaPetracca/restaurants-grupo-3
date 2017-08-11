package com.despegar.jav2017.infierno;

public class DemonioDeSombras extends Demonio {

    private static Integer nivelDeMaldad = 50;

    @Override
    public Boolean puedeCazar(Alma alma) {
        return !alma.esFriolenta();
    }

    @Override
    protected void ponerObstaculos(Alma alma) {
        alma.disminuirNivelDeValor(0.5);
    }
}
