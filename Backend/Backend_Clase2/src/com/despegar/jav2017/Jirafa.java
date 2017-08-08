package com.despegar.jav2017;

public class Jirafa implements AnimalCorredor {

    private Integer peso;

    public Jirafa(Integer peso) {
        this.peso = peso;
    }


    public void correr(Integer kilometros)
    {
        System.out.println("Soy una jirafa");
    }
}
