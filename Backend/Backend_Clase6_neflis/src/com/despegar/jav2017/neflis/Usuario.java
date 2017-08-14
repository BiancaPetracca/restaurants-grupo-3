package com.despegar.jav2017.neflis;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    Set<Pelicula> peliculasQueVio = new HashSet<>();
    Set<SerieVista> seriesQueVio = new HashSet<>();
    Set<Capitulo> capitulosQueVio = new HashSet<>();

    public Boolean noTerminoDeVer(Serie serie) {
        return ! serie.fueCompletamenteVistoPor(this);
    }

    public Boolean vio(Pelicula pelicula) {
        return peliculasQueVio.contains(pelicula);
    }

    public Boolean vio(Capitulo capitulo){
        return seriesQueVio.stream()
            .anyMatch(serie -> serie.fueVisto(capitulo));
    }

}

