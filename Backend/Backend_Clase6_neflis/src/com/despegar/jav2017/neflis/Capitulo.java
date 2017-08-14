package com.despegar.jav2017.neflis;

import java.util.HashSet;
import java.util.Set;

public class Capitulo {

    private Set<String> actoresInvitados = new HashSet<>();
    private Integer duracion;
    private Integer orden;

    public Boolean actuo(String actor) {
        return actoresInvitados.contains(actor);
    }

    public Boolean fueCompletamenteVistoPor(Usuario usuario) {
        return usuario.vio(this);
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getOrden() {
        return orden;
    }
}
