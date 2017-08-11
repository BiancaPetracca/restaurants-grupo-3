package com.despegar.jav2017.infierno;

public class NingunDemonio extends Demonio {
    @Override
    protected Boolean puedeCazar(Alma alma) {
        return false;
    }

    @Override
    protected void ponerObstaculos(Alma alma) {

    }
}
