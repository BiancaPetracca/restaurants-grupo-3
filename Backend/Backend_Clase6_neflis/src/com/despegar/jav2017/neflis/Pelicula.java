package com.despegar.jav2017.neflis;

import java.util.HashSet;
import java.util.Set;

public class Pelicula extends Contenido {

    public Pelicula(String genero, Boolean destacado, Set<String> actores, Integer duracion) {
        super(genero, destacado);
        this.actores = actores;
        this.duracion = duracion;
    }

    private Set<String> actores = new HashSet<>();
    private Integer duracion;

    public Boolean actuo(String actor) {
        return actores.contains(actor);
    }

    @Override
    public Boolean fueCompletamenteVistoPor(Usuario usuario) {
        return usuario.vio(this);
    }

    @Override
    public Integer getDuracion() {
        return duracion;
    }

}
