package com.despegar.jav2017.infierno;

public class DemonioDeFuego extends Demonio {

    @Override
    protected Boolean puedeCazar(Alma alma) {
        return alma.getNivelDeValor() < getLimiteDeNivelDeValor();
    }

    @Override
    protected void ponerObstaculos(Alma alma) {

    }

}
