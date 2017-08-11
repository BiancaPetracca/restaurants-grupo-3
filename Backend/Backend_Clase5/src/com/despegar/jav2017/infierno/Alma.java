package com.despegar.jav2017.infierno;

public class Alma {
;
    private Integer bondad;
    private Double nivelDeValor;
    private Boolean friolenta;

    public Integer getBondad() {
        return bondad;
    }

    public Boolean esFriolenta() {
        return friolenta;
    }

    public Double getNivelDeValor() {
        return nivelDeValor;
    }

    public void disminuirBondad(Integer cantidad) {
        bondad = bondad - cantidad;
    }

    public void disminuirNivelDeValor(Double factorDeReduccion) {
        this.nivelDeValor = nivelDeValor * factorDeReduccion;
    }

    public Double poder() {
        return nivelDeValor + bondad;
    }

    public Boolean puedeSerAtormentadaHastaLaLocura(Demonio demonio){
        Alma alma = this;
        demonio.atormentar(alma);
        return alma.getBondad() < 10;
    }

    public void hacerFriolenta(){
        this.friolenta = true;
    }

    public void dejarDeSerFriolenta(){
        this.friolenta = false;
    }


}
