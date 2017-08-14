package com.despegar.jav2017.infierno;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Diablo {

    private Set<Demonio> demoniosACargo = new HashSet<>();
    private Set<Alma> almas = new HashSet<>();

    private void chequearExistenciaDeDemonios() {
        if (demoniosACargo.isEmpty())
            throw new RuntimeException("El diablo no tiene ningun demonio a cargo");
    }

    public Demonio pequenioDemonio() {
        chequearExistenciaDeDemonios();
        return demoniosACargo.stream()
                .min(Comparator.comparingDouble(Demonio::getPoderEntregado))
                .get();
    }

    public void absorber(Set<Alma> almasCazadas) {
        almas.addAll(almasCazadas);
    }

    public void asignarMision(Demonio demonio, Mision mision) {
        if (mision.puedeSerCumplidaPor(demonio))
            demonio.notificarQuePuedeCumplirMision();
    }
}


