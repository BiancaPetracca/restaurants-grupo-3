package com.despegar.jav2017.infierno;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Demonio {

    private Double nivelDeMaldad;
    private Integer limiteDeNivelDeValor;
    private Set<Alma> almasCazadas = new HashSet<>();
    protected EstadoDeAnimo estadoDeAnimo = new Normal();

    public Boolean esJodida(Alma alma){
        return getNivelDeMaldadRequerido() > alma.getBondad() &&
                this.puedeCazar(alma);
    }

    public Double getNivelDeMaldadRequerido(){
        return nivelDeMaldad *
                estadoDeAnimo.getPorcentajeDeMaldadRequerido();
    }

    public Set<Alma> almasCazables(Lugar lugar){
        return lugar.getAlmas().stream().filter(this::esJodida)
                .collect(Collectors.toSet());
    }


    protected abstract Boolean puedeCazar(Alma alma);

    public Integer getLimiteDeNivelDeValor() {
        return limiteDeNivelDeValor;
    }

    public Double getNivelDeMaldad() {
        return nivelDeMaldad;
    }

    public void aumentarNivelDeMaldad(Integer cantidad){
        nivelDeMaldad += cantidad;
    }

    public void disminuirNivelDeMaldadHasta(Double porcentaje){
        nivelDeMaldad *= porcentaje;
    }

    public void cazar(Alma alma){
        almasCazadas.add(alma);
    }

    public void atormentar(Alma alma){
        alma.disminuirBondad(5);
        this.ponerObstaculos(alma);
    }

    protected abstract void ponerObstaculos(Alma alma);

    public void intentarCazar(Lugar lugar, Alma alma){
        if (esJodida(alma))
            cazar(alma);
        else {
            lugar.entregar(alma);
            atormentar(alma);
        }
    }

    public void salirACazar(Lugar lugar){
        lugar.ataqueDe(this);
    }

    public void ponerseFelizSiCazoMucho() {
        if(almasCazadas.size() > 20)
            ponerseFeliz();
    }

    public void ponerseFeliz() {
        this.estadoDeAnimo = new Feliz();
    }


    public void rendirCuentas(Diablo diablo){
        entregarAlmas(diablo);
        vaciarAlmas();
    }

    private void entregarAlmas(Diablo diablo) {
        if(almasCazadas.isEmpty())
            diablo.castigar(this);
        else
            diablo.absorber(almasCazadas);

    }

    public void vaciarAlmas() {
        almasCazadas.clear();
    }

    public void deprimirse() {
        this.estadoDeAnimo = new Deprimido();
    }

    public void notificarQuePuedeCumplirMision() {
        estadoDeAnimo.cambiarDeEstadoPorMisionPosible(this);
    }

    public void normalizarse() {
        this.estadoDeAnimo = new Normal();
    }
}

