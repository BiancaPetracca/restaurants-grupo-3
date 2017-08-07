package com.despegar.jav2017;

public class Doctor {

    public void hacerRutina(AnimalCorredor animalCorredor, Integer km){
        System.out.println("Soy un doctor y voy a hacer correr a un animal");
        animalCorredor.correr(km);
        System.out.println("Ya hice correr al animal " + km + " km");
    }

}
