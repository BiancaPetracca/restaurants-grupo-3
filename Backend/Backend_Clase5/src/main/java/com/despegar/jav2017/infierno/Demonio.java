package com.despegar.jav2017.infierno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.lang.Integer.max;

public abstract class Demonio {
    public Demonio(Integer limiteDeNivelDeValor, String nombre) {
        if(limiteDeNivelDeValor < 0)
            LOGGER.warn("El limite de nivel de valor del demonio {} era {} y tiene que ser positivo así que se establecerá en 0",
                    this, limiteDeNivelDeValor);

        this.limiteDeNivelDeValor = max(0, limiteDeNivelDeValor);
        this.nombre = nombre;
        LOGGER.info("Se creó un nuevo demonio: {}", this);
    }

    protected Double nivelDeMaldad;
    private Integer limiteDeNivelDeValor;
    private Double poderEntregado = 0.0;
    private Set<Alma> almasCazadas = new HashSet<>();
    protected EstadoDeAnimo estadoDeAnimo = new Normal();
    private static Integer bondadQueDisminuyeEnAlmas;
    private String nombre;
    private static final Logger LOGGER = LoggerFactory.getLogger(Demonio.class);

    public Integer getBondadQueDisminuyeEnAlmas() {
        return bondadQueDisminuyeEnAlmas;
    }

    public Boolean esJodida(Alma alma) {
        return getNivelDeMaldadRequerido() > alma.getBondad() &&
                this.puedeCazar(alma);
    }

    public Double getNivelDeMaldadRequerido() {
        return nivelDeMaldad *
                estadoDeAnimo.getPorcentajeDeMaldadRequerido();
    }

    public Set<Alma> almasCazables(Lugar lugar) {
        return lugar.getAlmas().stream().filter(this::esJodida)
                .collect(Collectors.toSet());
    }

    public Double getPoderEntregado() {
        return poderEntregado;
    }

    public void agregarPoderEntregado() {
        poderEntregado += almasCazadas.stream().mapToDouble(Alma::poder).sum();
    }


    protected abstract Boolean puedeCazar(Alma alma);

    public Integer getLimiteDeNivelDeValor() {
        return limiteDeNivelDeValor;
    }

    public Double getNivelDeMaldad() {
        return nivelDeMaldad;
    }

    public void aumentarNivelDeMaldad(Integer cantidad) {
        nivelDeMaldad += cantidad;
    }

    public void disminuirNivelDeMaldadHasta(Double porcentaje) {

        nivelDeMaldad *= porcentaje;
    }

    public void cazar(Alma alma) {
        almasCazadas.add(alma);
    }

    public void atormentar(Alma alma) {
        LOGGER.info("El demonio " + nombre + " está atormentando a un alma");
        alma.disminuirBondad(bondadQueDisminuyeEnAlmas);
        this.ponerObstaculos(alma);
    }

    protected abstract void ponerObstaculos(Alma alma);

    public void intentarCazar(Lugar lugar, Alma alma) {
        if (esJodida(alma))
            cazar(alma);
        else {
            lugar.entregar(alma);
            atormentar(alma);
        }
    }

    public void salirACazar(Lugar lugar) {
        lugar.ataqueDe(this);
    }

    public void ponerseFelizSiCazoMucho() {
        if (almasCazadas.size() > 20)
            ponerseFeliz();
    }

    public void ponerseFeliz() {
        this.estadoDeAnimo = new Feliz();
    }


    public void rendirCuentas(Diablo diablo) {
        entregarAlmas(diablo);
        agregarPoderEntregado();
        vaciarAlmas();
    }

    private void entregarAlmas(Diablo diablo) {
        if (almasCazadas.isEmpty())
            this.serCastigado();
        else
            diablo.absorber(almasCazadas);

    }

    public void serCastigado() {
        LOGGER.info("El demonio " + nombre + " esta siendo castigado");
        nivelDeMaldad *= 0.9;
        deprimirse();
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

    public String getNombre() {
        return nombre;
    }
}

