package com.despegar.jav2017.neflis;

public abstract class Contenido {

    private String genero;
    private Boolean destacado;

    public Contenido(String genero, Boolean destacado) {
        this.genero = genero;
        this.destacado = destacado;
    }

    public abstract Boolean actuo(String actor);

    public Boolean esRecomendadoPara(Usuario usuario){
        return destacado;
    }

    public abstract Boolean fueCompletamenteVistoPor(Usuario usuario);

    public abstract Integer getDuracion();
}
