package com.despegar.jav2017.infierno;

public class Safari extends Mision {

    public Integer porcentajeDeAlmas;
    public Lugar lugar;

    public Boolean puedeSerCumplidaPor(Demonio demonio){
        return demonio.almasCazables(lugar).size() >
                porcentajeDeAlmas * lugar.getCantidadDeAlmas();
    }
}
