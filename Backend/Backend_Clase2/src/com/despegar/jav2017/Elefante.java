package com.despegar.jav2017;

public class Elefante implements AnimalCorredor {

    private Integer peso;

    public Elefante(Integer peso) {
        this.peso = peso;
    }

    public void barritar() {

        System.out.println("Estoy barritando");
    }

    public void correr(Integer kilometros) {
        System.out.println("Soy un elefante y estoy corriendo " + kilometros + " km");
    }

    public Integer getPeso()
    {
        return peso;
    }

    public void setPeso(Integer peso)
    {
        this.peso = peso;
    }
}