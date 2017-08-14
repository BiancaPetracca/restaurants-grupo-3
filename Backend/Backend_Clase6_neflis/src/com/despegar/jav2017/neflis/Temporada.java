package com.despegar.jav2017.neflis;

import java.util.HashSet;
import java.util.Set;

public class Temporada extends Contenido {

    private Set<Capitulo> capitulos = new HashSet<>();
    private Integer cantidadDeCapitulos;

    public Temporada(Set<Capitulo> capitulos, Integer cantidadDeCapitulos) {
        this.capitulos = capitulos;
        this.cantidadDeCapitulos = cantidadDeCapitulos;
    }

    public Set<Capitulo> getCapitulos() {
        return capitulos;
    }

    public Boolean actuo(String actor) {
        return capitulos.stream()
                .anyMatch(contenido -> contenido.actuo(actor));
    }

    @Override
    public Boolean fueCompletamenteVistoPor(Usuario usuario) {
        return capitulos.stream()
                .allMatch(capitulo -> usuario.vio(capitulo));
    }

    @Override
    public Integer getDuracion() {
        return capitulos.stream()
                .mapToInt(Capitulo::getDuracion)
                .sum();
    }
}
