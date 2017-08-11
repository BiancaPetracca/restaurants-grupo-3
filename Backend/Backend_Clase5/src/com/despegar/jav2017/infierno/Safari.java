package com.despegar.jav2017.infierno;

public class Safari implements Mision {

    public Double porcentajeDeAlmas;
    public Lugar lugar;

    public Boolean puedeSerCumplidaPor(Demonio demonio){
        return lugar.porcentajeDeAlmasCazablesPara(demonio) > porcentajeDeAlmas;
    }
}
