package com.despegar.jav2017.infierno;

public class Deprimido extends EstadoDeAnimo {
    @Override
    public void cambiarDeEstadoPorMisionPosible(Demonio demonio) {
        demonio.normalizarse();
    }

    @Override
    public Double getPorcentajeDeMaldadRequerido() {
        return 2.0;
    }

    @Override
    public void hacerFriolenta(Alma alma) {

    }

    @Override
    public void dejarDeSerFriolenta(Alma alma) {

    }
}
