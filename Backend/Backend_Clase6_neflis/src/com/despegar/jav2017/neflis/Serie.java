package com.despegar.jav2017.neflis;

import java.util.*;
import java.util.stream.Collectors;

public class Serie extends Contenido {

    private List<Temporada> temporadas = new ArrayList<>();

    private Set<String> actoresProtagonicos = new HashSet<>();

    public Serie(String genero, Boolean destacado, List<Temporada> temporadas, Set<String> actoresProtagonicos) {
        super(genero, destacado);
        this.temporadas = temporadas;
        this.actoresProtagonicos = actoresProtagonicos;
    }

    public Boolean actuo(String actor){
        return actoresProtagonicos.contains(actor) || actuoEnAlgunCapitulo(actor);
    }

    public Boolean actuoEnAlgunCapitulo(String actor){
        return temporadas.stream()
                .anyMatch(temporada -> temporada.actuo(actor));
    }


    @Override
    public Boolean esRecomendadoPara(Usuario usuario){
        return super.esRecomendadoPara(usuario) ||
                usuario.noTerminoDeVer(this);
    }

    @Override
    public Boolean fueCompletamenteVistoPor(Usuario usuario) {
        return temporadas.stream()
                .allMatch(temporada -> temporada.fueCompletamenteVistoPor(usuario));
    }

    @Override
    public Integer getDuracion() {
        return temporadas.stream()
                .mapToInt(Temporada::getDuracion)
                .sum();
    }

    public Capitulo ultimoCapituloDisponible() {
        return getCapitulos()
                .stream()
                .max(Comparator.comparingInt(Capitulo::getOrden))
                .orElse(new NingunCapitulo());

    }


    public Set<Capitulo> getCapitulos() {
        return temporadas.stream()
                .flatMap(temporada -> temporada.getCapitulos().stream())
                .collect(Collectors.toSet());
    }
}
