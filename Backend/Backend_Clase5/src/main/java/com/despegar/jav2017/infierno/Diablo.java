package com.despegar.jav2017.infierno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Diablo {

    private final static Logger LOGGER = LoggerFactory.getLogger(Diablo.class);
    private Set<Demonio> demoniosACargo = new HashSet<>();
    private Set<Alma> almas = new HashSet<>();

    private void chequearExistenciaDeDemonios() {
        LOGGER.info("Chequeando existencia de demonios...");
        if (demoniosACargo.isEmpty()) {
            LOGGER.error("El diablo no tiene ningún demonio a cargo");
            throw new ElDiabloNoTieneDemoniosACargoException();
        }
    }

    public Demonio pequenioDemonio() {
        chequearExistenciaDeDemonios();
        Demonio pequenioDemonio = demoniosACargo.stream()
                .min(Comparator.comparingDouble(Demonio::getPoderEntregado))
                .get();
        LOGGER.info("El pequenio demonio del diablo es " + pequenioDemonio.getNombre());
        return pequenioDemonio;
    }

    public void absorber(Set<Alma> almasCazadas) {
        almas.addAll(almasCazadas);
    }

    public void asignarMision(Demonio demonio, Mision mision) {
        if (mision.puedeSerCumplidaPor(demonio))
            demonio.notificarQuePuedeCumplirMision();
        LOGGER.info("El diablo no puede cumplir la mision " + mision.toString() +  "asignada");
    }
}


