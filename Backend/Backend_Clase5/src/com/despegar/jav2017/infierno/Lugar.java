package com.despegar.jav2017.infierno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Lugar {

    public Lugar(Set<Alma> almas, String nombre) {
        this.almas = almas;
        this.nombre = nombre;
    }

    private Set<Alma> almas = new HashSet<>();
    private final static Logger LOGGER = LoggerFactory.getLogger(Lugar.class);
    private String nombre;


    public Set<Alma> getAlmas() {
        return almas;
    }

    public void entregar(Alma alma) {
        almas.remove(alma);
    }

    public Integer getCantidadDeAlmasJodidas(Demonio demonio) {
        return almas.stream().filter(demonio::esJodida)
                .collect(Collectors.toList()).size();
    }

    public Integer getCantidadDeAlmas() {
        return almas.size();
    }

    public void ataqueDe(Demonio demonio) {
        LOGGER.info("El demonio " + demonio.getNombre() + " está atacando el lugar " + nombre);
        Integer aumentoDeMaldad = aumentoDeMaldadPara(demonio);
        almas.forEach(alma -> {
                    demonio.intentarCazar(this, alma);
                }
        );
        tormentoDe(demonio);
        demonio.ponerseFelizSiCazoMucho();

    }

    public void tormentoDe(Demonio demonio) {
        almas.forEach(demonio::atormentar);
    }


    public Integer aumentoDeMaldadPara(Demonio demonio) {
        Integer almasAtormentadas = getCantidadDeAlmasJodidas(demonio);
        Integer almasDelLugar = almas.size();
        return almasAtormentadas + (almasAtormentadas - almasDelLugar) * 2;
    }

    public Boolean existeUnAlmaAtormentadaHastaLaLocuraPor(Demonio demonio) {
        return almas.stream()
                .anyMatch(alma -> alma.puedeSerAtormentadaHastaLaLocura(demonio));
    }

    public Set<Alma> almasCazablesPara(Demonio demonio) {
        return almas.stream()
                .filter(alma -> !demonio.esJodida(alma)).collect(Collectors.toSet());
    }


    public Double porcentajeDeAlmasCazablesPara(Demonio demonio) {
        return 1.0 * almasCazablesPara(demonio).size() / almas.size();
    }
}
