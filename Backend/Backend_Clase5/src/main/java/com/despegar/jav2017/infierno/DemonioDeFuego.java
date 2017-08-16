package com.despegar.jav2017.infierno;

public class DemonioDeFuego extends Demonio {


    public DemonioDeFuego(Double nivelDeMaldad, Integer limiteDeNivelDeValor, String nombre) {
        super(limiteDeNivelDeValor, nombre);
        this.nivelDeMaldad = nivelDeMaldad;
    }

    @Override
    protected Boolean puedeCazar(Alma alma) {
        return alma.getNivelDeValor() < getLimiteDeNivelDeValor();
    }

    @Override
    protected void ponerObstaculos(Alma alma) {
        estadoDeAnimo.dejarDeSerFriolenta(alma);
    }

}
