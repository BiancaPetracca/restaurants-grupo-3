package com.despegar.jav2017.infierno;

public class Feliz extends EstadoDeAnimo {

    @Override
    public void cambiarDeEstadoPorMisionPosible(Demonio demonio) {
        demonio.aumentarNivelDeMaldad(5);
    }

    @Override
    public Double getPorcentajeDeMaldadRequerido() {
        return 0.5;
    }
}
