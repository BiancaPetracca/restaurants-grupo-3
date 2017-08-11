package com.despegar.jav2017.infierno;

public class DemonioDeHielo extends Demonio {
    @Override
    public Boolean puedeCazar(Alma alma) {
        return alma.esFriolenta();
    }

    @Override
    protected void ponerObstaculos(Alma alma) {
        estadoDeAnimo.hacerFriolenta(alma);
    }

}
