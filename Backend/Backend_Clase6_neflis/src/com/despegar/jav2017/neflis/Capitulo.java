package com.despegar.jav2017.neflis;

import java.util.HashSet;
import java.util.Set;

public class Capitulo extends Contenido {

    private Set<String> actoresInvitados = new HashSet<>();
    private Integer duracion;
    private Integer orden;

    public Boolean actuo(String actor) {
        return actoresInvitados.contains(actor);
    }

    @Override
    public Boolean fueCompletamenteVistoPor(Usuario usuario) {
        return usuario.vio(this);
    }

    @Override
    public Integer getDuracion() {
        return duracion;
    }

    public Integer getOrden() {
        return orden;
    }
}
