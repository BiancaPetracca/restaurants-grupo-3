package com.despegar.jav2017.infierno;

import java.util.HashSet;
import java.util.Set;

public class Tormento implements Mision {

    private Set<Lugar> lugares = new HashSet<>();

    @Override
    public Boolean puedeSerCumplidaPor(Demonio demonio) {
       return lugares.stream()
                .anyMatch(lugar -> lugar.existeUnAlmaAtormentadaHastaLaLocuraPor(demonio));
    }
}
