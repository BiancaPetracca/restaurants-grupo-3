package com.despegar.jav2017.infierno;

public abstract class EstadoDeAnimo {

    public abstract void cambiarDeEstadoPorMisionPosible(Demonio demonio);

    public abstract Double getPorcentajeDeMaldadRequerido();

    public void hacerFriolenta(Alma alma) {
        alma.hacerFriolenta();
    }

    public void dejarDeSerFriolenta(Alma alma) {
        alma.dejarDeSerFriolenta();
    }
}
