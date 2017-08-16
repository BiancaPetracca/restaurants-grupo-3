package com.despegar.jav2017.infierno;

public class Normal extends EstadoDeAnimo {
    @Override
    public void cambiarDeEstadoPorMisionPosible(Demonio demonio) {
        demonio.ponerseFeliz();
    }

    @Override
    public Double getPorcentajeDeMaldadRequerido() {
        return 1.0;
    }
}
